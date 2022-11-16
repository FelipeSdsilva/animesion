package com.animeson.projectanime.dto;

import java.io.Serializable;

public class EpisodeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nameEpisode;
	private String description;

	public EpisodeDTO() {
	}

	public EpisodeDTO(Long id, String nameEpisode, String description) {
		super();
		this.id = id;
		this.nameEpisode = nameEpisode;
		this.description = description;
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
}
