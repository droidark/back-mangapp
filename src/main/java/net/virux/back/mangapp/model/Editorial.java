package net.virux.back.mangapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_editorial")
public class Editorial {

	private Integer idEditorial;
	private String editorialName;
	private String editorialUrl;
	private String editorialAvatar;
	
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
}
