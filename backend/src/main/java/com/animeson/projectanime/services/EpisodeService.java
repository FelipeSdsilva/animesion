package com.animeson.projectanime.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.EpisodeDTO;
import com.animeson.projectanime.repositories.EpisodeRepository;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeService {

	private EpisodeRepository epiRepository;

	@Transactional(readOnly = true)
	public List<EpisodeDTO> findAllEpisode(Long id) {
		try {
			return epiRepository.findByAnimeId(id).stream().map(EpisodeDTO::new).toList();
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("");
		}
	}

}
