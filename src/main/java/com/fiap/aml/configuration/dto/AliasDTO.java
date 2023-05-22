package com.fiap.aml.configuration.dto;

import java.io.Serializable;

public class AliasDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String alias;
	
	public AliasDTO() {}

	public AliasDTO(String alias) {
		super();
		this.alias = alias;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
