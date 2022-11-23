package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.animeson.projectanime.entites.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotBlank(message = "This space cannot be empty")
	private String name;
	
	@NotBlank(message = "This space cannot be empty")
	private String nickName;
	
	@Email(message = "Enter with valid email")
	private String email;

	private Set<RoleDTO> roles = new HashSet<>();
	
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		nickName = entity.getNickName();
		email = entity.getEmail();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
	}


}
