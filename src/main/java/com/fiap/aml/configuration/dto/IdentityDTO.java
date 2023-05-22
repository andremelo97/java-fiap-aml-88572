package com.fiap.aml.configuration.dto;

import java.io.Serializable;

import com.fiap.aml.domain.Identity;

public class IdentityDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String nationality;
	private String gender;
	private String birth;
	private String hair;
	private String eyes;
	private String height;
	private String weight;
	private Double reward;
	private Boolean fbi;
	private Boolean interpol;
	
	public IdentityDTO() {}
	
	public IdentityDTO (Identity obj) {
		id = obj.getId();
		name = obj.getName();
		nationality = obj.getNationality();
		gender = obj.getGender();
		birth = obj.getBirth();
		hair = obj.getHair();
		eyes = obj.getEyes();
		height = obj.getHeight();
		weight = obj.getWeight();
		reward = obj.getReward();
		fbi = obj.getFbi();
		interpol = obj.getInterpol();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Double getReward() {
		return reward;
	}

	public void setReward(Double reward) {
		this.reward = reward;
	}

	public Boolean getFbi() {
		return fbi;
	}

	public void setFbi(Boolean fbi) {
		this.fbi = fbi;
	}

	public Boolean getInterpol() {
		return interpol;
	}

	public void setInterpol(Boolean interpol) {
		this.interpol = interpol;
	} 

}
