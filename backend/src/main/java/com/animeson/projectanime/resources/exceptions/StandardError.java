package com.animeson.projectanime.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Instant timeStamp;
	private Integer status;
	private String error;
	private String mensage;
	private String path;
	

}
