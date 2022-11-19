package com.animeson.projectanime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.AnimeDTO;
import com.animeson.projectanime.entites.Anime;
import com.animeson.projectanime.repositories.AnimeRepository;

@Service
public class AnimeService {

	@Autowired
	private AnimeRepository aniRepository;
	
	@Transactional(readOnly = true)
	public Page<AnimeDTO> findAllPaged(Pageable pageable) {
		Page<Anime> pagedAni = aniRepository.findAll(pageable);
		return pagedAni.map(ani -> new AnimeDTO(ani));
	}

	public AnimeDTO animefindById(Long id) {
		
		return null;
	}

}
