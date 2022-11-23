package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import com.animeson.projectanime.entites.Anime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnimeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message ="This space cannot be empty")
	private String title;
	
	@Positive(message = "The number cannot be negative")
	private Integer qtdTemp;
	
	@NotBlank(message = "This space cannot be empty")
	private String synopsis;
	
	@NotBlank(message = "This space cannot be empty")
	private String language;
	
	@NotBlank(message = "This space cannot be empty")
	private String productorOrStudio;
	
	@PastOrPresent(message = "The date of anime cannot be future")
	private Instant dateLanc;
	
	@NotBlank(message = "This space cannot be empty")
	private String imgUrl;

	public AnimeDTO(Anime entity) {
		id = entity.getId();
		title = entity.getTitle();
		qtdTemp = entity.getQtdTemp();
		synopsis = entity.getSynopsis();
		language = entity.getLanguage();
		productorOrStudio = entity.getProductorOrStudio();
		dateLanc = entity.getDateLanc();
		imgUrl = entity.getImgUrl();
	}
}
