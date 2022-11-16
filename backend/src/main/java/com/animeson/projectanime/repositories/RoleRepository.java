package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
