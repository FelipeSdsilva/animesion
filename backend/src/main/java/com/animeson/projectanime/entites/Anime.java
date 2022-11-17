package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
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

@Entity
@Table(name = "tb_anime")
public class Anime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;

	@Column(columnDefinition = "")
	private String description;
	private String language;
	private String productorOrStudio;

	@Column(columnDefinition = "")
	private Instant dateLanc;
	private String imgUrl;
	private String videoUrl;

	@OneToMany(mappedBy = "anime")
	private List<Episode> episodies = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "tb_anime_genre",
		joinColumns = @JoinColumn(name = "anime_id"),
		inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private Set<Genre> genres = new HashSet<>();

	public Anime() {
	}

	public Anime(Long id, String title, String description, String language, String productorOrStudio, Instant dateLanc,
			String imgUrl, String videoUrl) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.language = language;
		this.productorOrStudio = productorOrStudio;
		this.dateLanc = dateLanc;
		this.imgUrl = imgUrl;
		this.videoUrl = videoUrl;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getProductorOrStudio() {
		return productorOrStudio;
	}

	public void setProductorOrStudio(String productorOrStudio) {
		this.productorOrStudio = productorOrStudio;
	}

	public Instant getDateLanc() {
		return dateLanc;
	}

	public void setDateLanc(Instant dateLanc) {
		this.dateLanc = dateLanc;
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

	public List<Episode> getEpisodies() {
		return episodies;
	}

	public Set<Genre> getGenres() {
		return genres;
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
		Anime other = (Anime) obj;
		return Objects.equals(id, other.id);
	}
}
