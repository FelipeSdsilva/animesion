package com.animeson.projectanime.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.GenreDTO;
import com.animeson.projectanime.entites.Genre;
import com.animeson.projectanime.repositories.GenreRepository;
import com.animeson.projectanime.services.exceptions.DatabaseException;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

@Service
public class GenreService {

	@Autowired
	private GenreRepository genRepository;

	@Transactional(readOnly = true)
	public List<GenreDTO> findAll() {
		return genRepository.findAll().stream().map(GenreDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public GenreDTO findById(Long id) {
		Genre entity = genRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new GenreDTO(entity);
	}

	@Transactional
	public GenreDTO insertNewGenre(GenreDTO genDto) {
		Genre entity = new Genre();
		entity.convertEntityInDto(entity, genDto);
		entity = genRepository.save(entity);
		return new GenreDTO(entity);
	}

	@Transactional
	public GenreDTO updateGenre(Long id, GenreDTO genDto) {
		try {
			Genre entity = genRepository.getReferenceById(id);
			entity.convertEntityInDto(entity, genDto);
			entity = genRepository.save(entity);
			return new GenreDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void deleteGenre(Long id) {
		try {
			genRepository.deleteById(id);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integraty violation");
		}
	}

}
