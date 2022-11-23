package com.animeson.projectanime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animeson.projectanime.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	@SuppressWarnings("unused")
	private NotificationRepository notRepository;
}
