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
@Table(name = "map_author")
public class Author {

	private Integer idAuthor;
	private String authorName;
	private String authorNameJp;
	private String authorAvatar;
	private String authorBio;
	private Set<AuthorRole> authorRoles = new HashSet<AuthorRole>();
	private Set<Title> titles = new HashSet<Title>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_author")
	public Integer getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(Integer idAuthor) {
		this.idAuthor = idAuthor;
	}
	
	@Column(name = "author_name")
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	@Column(name = "author_name_jp")
	public String getAuthorNameJp() {
		return authorNameJp;
	}
	public void setAuthorNameJp(String authorNameJp) {
		this.authorNameJp = authorNameJp;
	}
	
	@Column(name = "author_avatar")
	public String getAuthorAvatar() {
		return authorAvatar;
	}
	public void setAuthorAvatar(String authorAvatar) {
		this.authorAvatar = authorAvatar;
	}
	
	@Column(name = "author_bio")
	public String getAuthorBio() {
		return authorBio;
	}
	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(
			name = "map_author_x_role", 
			joinColumns = {@JoinColumn(name = "id_author")},
			inverseJoinColumns = {@JoinColumn(name = "id_author_role")})
	public Set<AuthorRole> getAuthorRoles() {
		return authorRoles;
	}
	public void setAuthorRoles(Set<AuthorRole> authorRoles) {
		this.authorRoles = authorRoles;
	}
	
	@ManyToMany(mappedBy = "authors")
	public Set<Title> getTitles() {
		return titles;
	}
	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
}
