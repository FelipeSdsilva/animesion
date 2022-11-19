package com.animeson.projectanime.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animeson.projectanime.dto.AnimeDTO;
import com.animeson.projectanime.dto.EpisodeDTO;
import com.animeson.projectanime.services.AnimeService;
import com.animeson.projectanime.services.EpisodeService;

@RestController
@RequestMapping(value ="/animes")
public class AnimeResource {

	@Autowired
	private AnimeService aniService;
	
	@Autowired
	private EpisodeService epiService;
	
	@GetMapping
	public ResponseEntity<Page<AnimeDTO>> findAllPaged(Pageable pageable){
		Page<AnimeDTO> pageDto = aniService.findAllPaged(pageable);
		return ResponseEntity.ok().body(pageDto);
	}
	
	@GetMapping(value = "{id}/episodes")
	public ResponseEntity<List<EpisodeDTO>> listAnimeEpisode(@PathVariable Long id){
		List<EpisodeDTO> epiList = epiService.findAllEpisode(id);
		return ResponseEntity.ok().body(epiList);
	}
	
}
