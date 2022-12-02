package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.animeson.projectanime.dto.AnimeDTO;

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
@Table(name = "tb_anime")
public class Anime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Integer qtdTemp;

	@Column(columnDefinition = "TEXT")
	private String synopsis;
	private String language;
	private String productorOrStudio;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dateLanc;
	private String imgUrl;

	@OneToMany(mappedBy = "anime")
	private List<Episode> episodies = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "tb_anime_genre",
	joinColumns = @JoinColumn(name = "anime_id"),
	inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private Set<Genre> genres = new HashSet<>();

	public void convertEntityInDTO(Anime entity, AnimeDTO animeDto) {

		entity.setTitle(animeDto.getTitle());
		entity.setQtdTemp(animeDto.getQtdTemp());
		entity.setSynopsis(animeDto.getSynopsis());
		entity.setLanguage(animeDto.getLanguage());
		entity.setProductorOrStudio(animeDto.getProductorOrStudio());
		entity.setDateLanc(animeDto.getDateLanc());
		entity.setImgUrl(animeDto.getImgUrl());
	}
}
