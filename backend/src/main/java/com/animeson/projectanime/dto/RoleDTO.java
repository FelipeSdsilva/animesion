package com.animeson.projectanime.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.animeson.projectanime.entites.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message ="This space cannot be empty")
	private String authority;

	public RoleDTO(Role entity) {
		id = entity.getId();
		authority = entity.getAuthority();
	}
}
