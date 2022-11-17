package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
