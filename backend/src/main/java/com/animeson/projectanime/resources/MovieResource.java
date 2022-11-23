package com.animeson.projectanime.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.animeson.projectanime.dto.MovieDTO;
import com.animeson.projectanime.services.MovieService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(value = "/movies")
@NoArgsConstructor
@AllArgsConstructor
public class MovieResource {

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
	public ResponseEntity<MovieDTO> insertNewMovie(@Valid @RequestBody MovieDTO movieDto){
		movieDto = movieService.insertMovie(movieDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(movieDto.getId()).toUri();
		return ResponseEntity.created(uri).body(movieDto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> updateMovie(@PathVariable Long id,@Valid @RequestBody MovieDTO movieDto){
		movieDto = movieService.updateMovie(id, movieDto);
		return ResponseEntity.ok().body(movieDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
		movieService.deleteMovie(id);
		return ResponseEntity.noContent().build();
	}
}
