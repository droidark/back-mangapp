package net.virux.back.mangapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_author_role")
public class AuthorRole {
	
	private Integer idAuthorRole;
	private String authorRoleDesc;
	private Set<Author> authors = new HashSet<Author>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_author_role")
	public Integer getIdAuthorRole() {
		return idAuthorRole;
	}
	public void setIdAuthorRole(Integer idAuthorRole) {
		this.idAuthorRole = idAuthorRole;
	}
	
	@Column(name = "author_role_desc")
	public String getAuthorRoleDesc() {
		return authorRoleDesc;
	}
	public void setAuthorRoleDesc(String authorRoleDesc) {
		this.authorRoleDesc = authorRoleDesc;
	}
	
	@ManyToMany(mappedBy = "authorRoles")
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
}
