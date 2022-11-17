package com.animeson.projectanime.dto;

import java.io.Serializable;

import com.animeson.projectanime.entites.Episode;

public class EpisodeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nameEpisode;
	private String description;
	private String imgUrl;
	private String videoUrl;
	private Integer temp;
	private Long animeId;
	
	public EpisodeDTO() {
	}

	public EpisodeDTO(Long id, String nameEpisode, String description, String imgUrl, String videoUrl, Integer temp,
			Long animeId) {
		this.id = id;
		this.nameEpisode = nameEpisode;
		this.description = description;
		this.imgUrl = imgUrl;
		this.videoUrl = videoUrl;
		this.temp = temp;
		this.animeId = animeId;
	}
	
	public EpisodeDTO(Episode entity) {
		id = entity.getId();
		nameEpisode = entity.getNameEpisode();
		description = entity.getDescription();
		imgUrl = entity.getImgUrl();
		videoUrl = entity.getVideoUrl();
		temp = entity.getTemp();
		animeId = new Episode().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameEpisode() {
		return nameEpisode;
	}

	public void setNameEpisode(String nameEpisode) {
		this.nameEpisode = nameEpisode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public Long getAnimeId() {
		return animeId;
	}

	public void setAnimeId(Long animeId) {
		this.animeId = animeId;
	}
}
