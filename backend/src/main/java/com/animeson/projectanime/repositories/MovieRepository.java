package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
