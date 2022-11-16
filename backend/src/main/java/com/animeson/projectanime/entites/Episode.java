package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.util.Objects;

public class Episode implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nameEpisode;
	private String description;
	
	public Episode() {
	}

	public Episode(Long id, String nameEpisode, String description) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episode other = (Episode) obj;
		return Objects.equals(id, other.id);
	}
}
