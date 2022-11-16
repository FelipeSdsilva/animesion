package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>{

}
