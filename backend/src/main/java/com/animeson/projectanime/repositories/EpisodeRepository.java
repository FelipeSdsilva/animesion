package com.animeson.projectanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Long> {

}
