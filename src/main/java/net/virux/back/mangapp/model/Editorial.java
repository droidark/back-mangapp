package net.virux.back.mangapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_editorial")
public class Editorial {

	private Integer idEditorial;
	private String editorialName;
	private String editorialUrl;
	private String editorialAvatar;
	private Set<Title> titles = new HashSet<Title>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_editorial")
	public Integer getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}
	
	@Column(name = "editorial_name")
	public String getEditorialName() {
		return editorialName;
	}
	public void setEditorialName(String editorialName) {
		this.editorialName = editorialName;
	}
	
	@Column(name = "editorial_url")
	public String getEditorialUrl() {
		return editorialUrl;
	}
	public void setEditorialUrl(String editorialUrl) {
		this.editorialUrl = editorialUrl;
	}
	
	@Column(name = "editorial_avatar")
	public String getEditorialAvatar() {
		return editorialAvatar;
	}
	public void setEditorialAvatar(String editorialAvatar) {
		this.editorialAvatar = editorialAvatar;
	}
	
	@OneToMany(mappedBy = "editorial")
	public Set<Title> getTitles() {
		return titles;
	}
	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
}
