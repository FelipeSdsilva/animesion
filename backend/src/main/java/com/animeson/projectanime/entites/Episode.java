package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_episode")
public class Episode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameEpisode;
	private String videoUrl;
	private Integer temp;

	@ManyToOne
	@JoinColumn(name = "anime_id")
	private Anime anime;

	public Episode() {
	}

	public Episode(Long id, String nameEpisode, String videoUrl, Integer temp, Anime anime) {
		this.id = id;
		this.nameEpisode = nameEpisode;
		this.videoUrl = videoUrl;
		this.temp = temp;
		this.anime = anime;
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

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
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
