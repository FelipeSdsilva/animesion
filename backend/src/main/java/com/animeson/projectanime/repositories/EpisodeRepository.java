package com.animeson.projectanime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.animeson.projectanime.entites.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Long> {

	@Query(nativeQuery = true, 
			value = "SELECT * FROM TB_EPISODE WHERE ANIME_ID =:animeId")
	public List<Episode> findByAnimeId(Long animeId);
	
	
	/*@Query("SELECT new com.animeson.projectanime.dto.EpisodeDTO(obj.id,Obj.nameEpisode,obj.videoUrl,obj.temp,obj.animeId) "
			+ "FROM Episode obj WHERE obj.anime.id =:animeId")
	public List<EpisodeDTO> findByAnimeIdJpql(Long animeId);
	*/
}
