package com.animeson.projectanime.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.animeson.projectanime.dto.AnimeDTO;
import com.animeson.projectanime.dto.EpisodeDTO;
import com.animeson.projectanime.services.AnimeService;
import com.animeson.projectanime.services.EpisodeService;

@RestController
@RequestMapping(value = "/animes")
public class AnimeResource {

	@Autowired
	private AnimeService aniService;

	@Autowired
	private EpisodeService epiService;

	@GetMapping
	public ResponseEntity<Page<AnimeDTO>> findAllPaged(Pageable pageable) {
		Page<AnimeDTO> pageDto = aniService.findAllPaged(pageable);
		return ResponseEntity.ok().body(pageDto);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<AnimeDTO> findByAnimeForId(Long id) {
		AnimeDTO aniDto = aniService.animefindById(id);
		return ResponseEntity.ok().body(aniDto);
	}

	@GetMapping(value = "{id}/episodes")
	public ResponseEntity<List<EpisodeDTO>> listAnimeEpisode(@PathVariable Long id) {
		List<EpisodeDTO> epiList = epiService.findAllEpisode(id);
		return ResponseEntity.ok().body(epiList);
	}

	@PostMapping
	public ResponseEntity<AnimeDTO> insertNewAnime(@RequestBody AnimeDTO aniDto) {
		aniDto = aniService.insertNewAnime(aniDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(aniDto.getId()).toUri();
		return ResponseEntity.created(uri).body(aniDto);
	}

	@PostMapping(value = "{id}/insert/episodes")
	public ResponseEntity<List<EpisodeDTO>> insertListEp(@PathVariable Long id, @RequestBody EpisodeDTO epiDto) {
		return null;
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<AnimeDTO> updateAnime(@PathVariable Long id, @RequestBody AnimeDTO aniDto) {
		aniDto = aniService.updateAnime(id, aniDto);
		return ResponseEntity.ok().body(aniDto);
	}

}
