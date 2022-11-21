package com.animeson.projectanime.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animeson.projectanime.dto.UserDTO;
import com.animeson.projectanime.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAllUser() {
		List<UserDTO> listUser = userService.findAllUser();
		return ResponseEntity.ok().body(listUser);
	}
}
