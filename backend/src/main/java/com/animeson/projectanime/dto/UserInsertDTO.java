package com.animeson.projectanime.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;

	@Size(min = 8 , max = 16, message = "The password must contain a min 8 and a max 16 characters")
	@NotBlank(message = "This password cannot be empty")
	private String password;

	public UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
