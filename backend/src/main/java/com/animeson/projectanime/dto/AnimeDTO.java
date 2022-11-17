package com.animeson.projectanime.dto;

import java.io.Serializable;
import java.time.Instant;

public class AnimeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Integer qtdTemp;
	private String synopsis;
	private String language;
	private String productorOrStudio;
	private Instant dateLanc;
	private String imgUrl;

	public AnimeDTO() {
	}

	public AnimeDTO(Long id, String title, Integer qtdTemp, String synopsis, String language,
			String productorOrStudio, Instant dateLanc, String imgUrl) {
		this.id = id;
		this.title = title;
		this.qtdTemp = qtdTemp;
		this.synopsis = synopsis;
		this.language = language;
		this.productorOrStudio = productorOrStudio;
		this.dateLanc = dateLanc;
		this.imgUrl = imgUrl;
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

	public Integer getQtdTemp() {
		return qtdTemp;
	}

	public void setQtdTemp(Integer qtdTemp) {
		this.qtdTemp = qtdTemp;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
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
}
