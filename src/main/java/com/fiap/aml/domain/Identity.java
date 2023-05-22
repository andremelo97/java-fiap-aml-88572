package com.fiap.aml.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fiap.aml.configuration.dto.AliasDTO;
import com.fiap.aml.configuration.dto.CrimeDTO;

@Document(collection="identity")
public class Identity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
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
	
	private List<AliasDTO> aliases = new ArrayList<>();
	
	private List<CrimeDTO> crimes = new ArrayList<>();
	
	public Identity() {}

	public Identity(String id, String name, String nationality, String gender, String birth, String hair, String eyes,
			String height, String weight, Double reward, Boolean fbi, Boolean interpol) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
		this.birth = birth;
		this.hair = hair;
		this.eyes = eyes;
		this.height = height;
		this.weight = weight;
		this.reward = reward;
		this.fbi = fbi;
		this.interpol = interpol;
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

	public List<AliasDTO> getAliases() {
		return aliases;
	}

	public void setAliases(List<AliasDTO> aliases) {
		this.aliases = aliases;
	}
	
	public List<CrimeDTO> getCrimes() {
		return crimes;
	}

	public void setCrimes(List<CrimeDTO> crimes) {
		this.crimes = crimes;
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
		Identity other = (Identity) obj;
		return Objects.equals(id, other.id);
	}
	
}
