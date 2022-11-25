package com.animeson.projectanime.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.UserDTO;
import com.animeson.projectanime.dto.UserInsertDTO;
import com.animeson.projectanime.dto.UserUpdateDTO;
import com.animeson.projectanime.entites.User;
import com.animeson.projectanime.repositories.UserRepository;
import com.animeson.projectanime.services.exceptions.DatabaseException;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService{

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(User.class);

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public List<UserDTO> findAllUser() {
		return userRepository.findAll().stream().map(UserDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public UserDTO findUserById(Long id) {
		User entity = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found "));
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insertNewUser(UserInsertDTO userDto) {
		User entity = new User();
		entity.convertEntityInDTO(entity, userDto);
		entity.setPassword(passwordEncoder.encode(userDto.getPassword()));
		entity = userRepository.save(entity);
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO updateUser(Long id, UserUpdateDTO userDto) {
		try {
			User entity = userRepository.getReferenceById(id);
			entity.convertEntityInDTO(entity, userDto);
			entity = userRepository.save(entity);
			return new UserDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
