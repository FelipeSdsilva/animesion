package com.animeson.projectanime.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animeson.projectanime.services.NotificationService;

@RestController
@RequestMapping()
public class NotificationResource {

	@Autowired
	@SuppressWarnings("unused")
	private NotificationService notService;
}
