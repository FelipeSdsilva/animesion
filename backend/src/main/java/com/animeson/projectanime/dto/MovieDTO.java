package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import com.animeson.projectanime.entites.Movie;

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

	public MovieDTO() {
	}

	public MovieDTO(Long id, String title, String subTitle, Instant dateLanc, String synopsis, String imgUrl,
			String language, String videoUrl) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.dateLanc = dateLanc;
		this.synopsis = synopsis;
		this.imgUrl = imgUrl;
		this.language = language;
		this.videoUrl = videoUrl;
	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Instant getDateLanc() {
		return dateLanc;
	}

	public void setDateLanc(Instant dateLanc) {
		this.dateLanc = dateLanc;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
}
