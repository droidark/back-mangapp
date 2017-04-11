package net.virux.back.mangapp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "map_title")
public class Title {

	private Integer idTitle;
	private Editorial editorial;
	private String titleName;
	private String titleCover;
	private String titleTotalVolumes;
	private String titleVolumesPublishedJp;
	private String titleVolumesPublishedMx;
	private String titleStatusJp;
	private String titleStatusMx;
	private Date titleLaunchJp;
	private Date titleLaunchMx;
	private Set<Issue> issues = new HashSet<Issue>();
	private Set<Author> authors = new HashSet<Author>();
	private Set<User> users = new HashSet<User>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_title")
	public Integer getIdTitle() {
		return idTitle;
	}
	public void setIdTitle(Integer idTitle) {
		this.idTitle = idTitle;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_editorial", nullable = false)
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	@Column(name = "title_name")
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	@Column(name = "title_cover")
	public String getTitleCover() {
		return titleCover;
	}
	public void setTitleCover(String titleCover) {
		this.titleCover = titleCover;
	}
	
	@Column(name = "title_total_volumes")
	public String getTitleTotalVolumes() {
		return titleTotalVolumes;
	}
	public void setTitleTotalVolumes(String titleTotalVolumes) {
		this.titleTotalVolumes = titleTotalVolumes;
	}
	
	@Column(name = "title_volumes_published_jp")
	public String getTitleVolumesPublishedJp() {
		return titleVolumesPublishedJp;
	}
	public void setTitleVolumesPublishedJp(String titleVolumesPublishedJp) {
		this.titleVolumesPublishedJp = titleVolumesPublishedJp;
	}
	
	@Column(name = "title_volumes_published_mx")
	public String getTitleVolumesPublishedMx() {
		return titleVolumesPublishedMx;
	}
	public void setTitleVolumesPublishedMx(String titleVolumesPublishedMx) {
		this.titleVolumesPublishedMx = titleVolumesPublishedMx;
	}
	
	@Column(name = "title_status_jp")
	public String getTitleStatusJp() {
		return titleStatusJp;
	}
	public void setTitleStatusJp(String titleStatusJp) {
		this.titleStatusJp = titleStatusJp;
	}
	
	@Column(name = "title_status_mx")
	public String getTitleStatusMx() {
		return titleStatusMx;
	}
	public void setTitleStatusMx(String titleStatusMx) {
		this.titleStatusMx = titleStatusMx;
	}
	
	@Column(name = "title_launch_jp")
	public Date getTitleLaunchJp() {
		return titleLaunchJp;
	}
	public void setTitleLaunchJp(Date titleLaunchJp) {
		this.titleLaunchJp = titleLaunchJp;
	}
	
	@Column(name = "title_launch_mx")
	public Date getTitleLaunchMx() {
		return titleLaunchMx;
	}
	public void setTitleLaunchMx(Date titleLaunchMx) {
		this.titleLaunchMx = titleLaunchMx;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "title")
	public Set<Issue> getIssues() {
		return issues;
	}
	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(
			name = "map_author_x_title", 
			joinColumns = {@JoinColumn(name = "id_title")}, 
			inverseJoinColumns = {@JoinColumn(name = "id_author")})
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	@ManyToMany(mappedBy = "titles")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
