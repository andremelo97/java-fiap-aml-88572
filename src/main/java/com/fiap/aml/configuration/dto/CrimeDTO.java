package com.fiap.aml.configuration.dto;

import java.io.Serializable;

public class CrimeDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String description;
	
	public CrimeDTO() {}

	public CrimeDTO(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
