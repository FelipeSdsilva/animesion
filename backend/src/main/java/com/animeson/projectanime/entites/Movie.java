package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.animeson.projectanime.dto.MovieDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_movie")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String subTitle;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dateLanc;

	@Column(columnDefinition = "TEXT")
	private String synopsis;
	private String imgUrl;
	private String language;
	private String videoUrl;

	@ManyToMany
	@JoinTable(name = "tb_movie_genre",
	joinColumns = @JoinColumn(name = "movie_id"), 
	inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private Set<Genre> genres = new HashSet<>();
	

	public void convertEntityInDto(Movie entity, MovieDTO movieDto) {
		entity.setTitle(movieDto.getTitle());
		entity.setSubTitle(movieDto.getSubTitle());
		entity.setDateLanc(movieDto.getDateLanc());
		entity.setSynopsis(movieDto.getSynopsis());
		entity.setImgUrl(movieDto.getImgUrl());
		entity.setLanguage(movieDto.getLanguage());
		entity.setVideoUrl(movieDto.getVideoUrl());
	}
}
