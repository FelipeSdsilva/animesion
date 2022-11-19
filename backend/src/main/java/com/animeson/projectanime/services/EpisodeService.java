package com.animeson.projectanime.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.EpisodeDTO;
import com.animeson.projectanime.entites.Episode;
import com.animeson.projectanime.repositories.EpisodeRepository;

@Service
public class EpisodeService {
	
	@Autowired
	private EpisodeRepository epiRepository;

	@Transactional(readOnly = true)
	public List<EpisodeDTO> findAllEpisode(Long id) {
		List<Episode> listEpi = epiRepository.findByAnimeId(id);
		return listEpi.stream().map(epi -> new EpisodeDTO(epi)).toList();
	}

	
}
