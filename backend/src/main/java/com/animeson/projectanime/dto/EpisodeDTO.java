package com.animeson.projectanime.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.animeson.projectanime.entites.Episode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "This space cannot be empty")
	private String nameEpisode;

	@NotBlank(message = "This space cannot be empty")
	private String videoUrl;

	@Positive(message = "This number cannot be negative")
	private Integer temp;
	private Long animeId;


	public EpisodeDTO(Episode entity) {
		id = entity.getId();
		nameEpisode = entity.getNameEpisode();
		videoUrl = entity.getVideoUrl();
		temp = entity.getTemp();
		animeId = entity.getAnime().getId();
	}
}
