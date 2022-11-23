package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import com.animeson.projectanime.entites.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message ="This space cannot be empty")
	private String title;
	
	@NotBlank(message ="This space cannot be empty")
	private String subTitle;
	
	@PastOrPresent(message = "The date of movie cannot be future")
	private Instant dateLanc;
	
	@NotBlank(message = "The movie has synopsis and cannot space be empty")
	private String synopsis;
	
	@NotBlank(message = "Enter with URL image is space cannot be empty")
	private String imgUrl;
	
	@NotBlank(message = "This")
	private String language;
	
	@NotBlank(message = "Enter with URL video is space cannot be empty")
	private String videoUrl;

	
	public MovieDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getSubTitle();
		dateLanc = entity.getDateLanc();
		synopsis = entity.getSynopsis();
		imgUrl = entity.getImgUrl();
		language = entity.getLanguage();
		videoUrl = entity.getVideoUrl();
	}
}
