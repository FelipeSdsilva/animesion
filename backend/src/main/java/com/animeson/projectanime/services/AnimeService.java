package com.animeson.projectanime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.AnimeDTO;
import com.animeson.projectanime.entites.Anime;
import com.animeson.projectanime.repositories.AnimeRepository;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

@Service
public class AnimeService {

	@Autowired
	private AnimeRepository aniRepository;

	@Transactional(readOnly = true)
	public Page<AnimeDTO> findAllPaged(Pageable pageable) {
		return aniRepository.findAll(pageable).map(ani -> new AnimeDTO(ani));
	}

	@Transactional(readOnly = true)
	public AnimeDTO animefindById(Long id) {
		Anime entity = aniRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not Found"));
		return new AnimeDTO(entity);
	}
	
	@Transactional
	public AnimeDTO insertNewAnime(AnimeDTO aniDto) {
		Anime ani = new Anime();
		ani.convertEntityInDTO(ani, aniDto);
		ani = aniRepository.save(ani);
		return new AnimeDTO(ani);
	}

}
