package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.animeson.projectanime.entites.User;

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
	
	public UserDTO() { 
	}

	public UserDTO(Long id, String name, String nickName, String email) {
		this.id = id;
		this.name = name;
		this.nickName = nickName;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		nickName = entity.getNickName();
		email = entity.getEmail();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
}
