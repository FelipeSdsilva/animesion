package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre , Long>{

}
