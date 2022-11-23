package com.animeson.projectanime.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.animeson.projectanime.services.validation.UserInsertValid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserInsertValid
public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;

	@Size(min = 8 , max = 16, message = "The password must contain a min 8 and a max 16 characters")
	@NotBlank(message = "This password cannot be empty")
	private String password;

}
