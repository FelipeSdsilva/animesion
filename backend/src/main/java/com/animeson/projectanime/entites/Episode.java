package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
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

	@Column(columnDefinition = "")
	private String description;
	private String imgUrl;
	private String videoUrl;

	@ManyToOne
	@JoinColumn(name ="anime_id")
	private Anime anime;
	
	public Episode() {
	}

	public Episode(Long id, String nameEpisode, String description, String imgUrl, String videoUrl) {
		this.id = id;
		this.nameEpisode = nameEpisode;
		this.description = description;
		this.imgUrl = imgUrl;
		this.videoUrl = videoUrl;
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
