package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.animeson.projectanime.dto.GenreDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_genre")
public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToMany(mappedBy = "genres")
	private Set<Anime> animes = new HashSet<>();

	@ManyToMany(mappedBy = "genres")
	private Set<Movie> movies = new HashSet<>();

	public void convertEntityInDto(Genre entity, GenreDTO genreDto) {
		entity.setName(genreDto.getName());
	}

}
