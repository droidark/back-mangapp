package net.virux.back.mangapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_demographic")
public class Demographic {
	
	private Integer idDemographic;
	private String nameDemographic;
	private String nameDemographicJp;
	private Set<Title> titles = new HashSet<Title>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_demographic")
	public Integer getIdDemographic() {
		return idDemographic;
	}
	public void setIdDemographic(Integer idDemographic) {
		this.idDemographic = idDemographic;
	}
	
	@Column(name = "name_demographic")
	public String getNameDemographic() {
		return nameDemographic;
	}
	public void setNameDemographic(String nameDemographic) {
		this.nameDemographic = nameDemographic;
	}
	
	@Column(name = "name_demographic_jp")
	public String getNameDemographicJp() {
		return nameDemographicJp;
	}
	public void setNameDemographicJp(String nameDemographicJp) {
		this.nameDemographicJp = nameDemographicJp;
	}
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(
			name = "map_demographic_x_title", 
			joinColumns = {@JoinColumn(name = "id_demographic")}, 
			inverseJoinColumns = {@JoinColumn(name = "id_title")})
	public Set<Title> getTitles() {
		return titles;
	}
	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
}
