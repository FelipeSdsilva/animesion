package com.animeson.projectanime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeson.projectanime.dto.MovieDTO;
import com.animeson.projectanime.entites.Movie;
import com.animeson.projectanime.repositories.MovieRepository;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> moviePaged(Pageable pageable) {
		return movieRepository.findAll(pageable).map(MovieDTO::new);
	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie entity = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new MovieDTO(entity);
	}

	@Transactional
	public MovieDTO insertMovie(MovieDTO movieDto) {
		Movie entity = new Movie();
		entity.convertEntityInDto(entity, movieDto);
		entity = movieRepository.save(entity);
		return new MovieDTO(entity);
	}
	
	@Transactional
	public MovieDTO updateMovie(Long id, MovieDTO movieDto) {
		return null;
	}

}
