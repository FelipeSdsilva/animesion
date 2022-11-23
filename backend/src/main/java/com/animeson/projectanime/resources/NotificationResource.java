package com.animeson.projectanime.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animeson.projectanime.services.NotificationService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping()
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResource {

	@SuppressWarnings("unused")
	private NotificationService notService;
}
