package com.animeson.projectanime.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.animeson.projectanime.dto.MovieDTO;
import com.animeson.projectanime.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> pagedMovie(Pageable pageable){
		Page<MovieDTO> moviePage = movieService.moviePaged(pageable);
		return ResponseEntity.ok().body(moviePage);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findMovieById(@PathVariable Long id){
		MovieDTO movieDto = movieService.findById(id); 
		return ResponseEntity.ok().body(movieDto);
	}
	
	@PostMapping
	public ResponseEntity<MovieDTO> insertNewMovie(@RequestBody MovieDTO movieDto){
		movieDto = movieService.insertMovie(movieDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(movieDto.getId()).toUri();
		return ResponseEntity.created(uri).body(movieDto);
	}
}
