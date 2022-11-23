package com.animeson.projectanime.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.animeson.projectanime.dto.GenreDTO;
import com.animeson.projectanime.services.GenreService;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {

	@Autowired
	private GenreService genService;

	@GetMapping
	public ResponseEntity<List<GenreDTO>> findAll() {
		List<GenreDTO> listGen = genService.findAll();
		return ResponseEntity.ok().body(listGen);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<GenreDTO> findById(@PathVariable Long id) {
		GenreDTO genreDto = genService.findById(id);
		return ResponseEntity.ok().body(genreDto);
	}

	@PostMapping
	public ResponseEntity<GenreDTO> insertNewGenre(@Valid @RequestBody GenreDTO genreDto) {
		genreDto = genService.insertNewGenre(genreDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(genreDto.getId())
				.toUri();
		return ResponseEntity.created(uri).body(genreDto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<GenreDTO> updateGenre(@PathVariable Long id,@Valid @RequestBody GenreDTO genreDto) {
		genreDto = genService.updateGenre(id, genreDto);
		return ResponseEntity.ok().body(genreDto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteGenre(@PathVariable Long id) {
		genService.deleteGenre(id);
		return ResponseEntity.noContent().build();
	}
}
