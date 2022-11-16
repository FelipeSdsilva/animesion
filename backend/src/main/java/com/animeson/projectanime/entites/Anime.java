package com.animeson.projectanime.entites;

import java.io.Serializable;
import java.util.Objects;

public class Anime implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String description;
	private String language;
	private String productorOrStudio;

	public Anime() {
	}

	public Anime(Long id, String title, String description, String language, String productorOrStudio) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.language = language;
		this.productorOrStudio = productorOrStudio;
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
