package net.virux.back.mangapp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "map_issue")
public class Issue {
	
	private Integer idIssue;
	private Title title;
	private String issueNameJp;
	private String issueNameMx;
	private Integer issueNumber;
	private Float issuePrice;
	private Date issueDateLaunchJp;
	private Date issueDateLaunchMx;
	private String issue_isbn_jp;
	private String issue_isbn_mx;	
	private Set<User> users = new HashSet<User>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_issue")
	public Integer getIdIssue() {
		return idIssue;
	}
	public void setIdIssue(Integer idIssue) {
		this.idIssue = idIssue;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_title", nullable = false)
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	
	@Column(name = "issue_name_jp")
	public String getIssueNameJp() {
		return issueNameJp;
	}
	public void setIssueNameJp(String issueNameJp) {
		this.issueNameJp = issueNameJp;
	}
	
	@Column(name = "issue_name_mx")
	public String getIssueNameMx() {
		return issueNameMx;
	}
	public void setIssueNameMx(String issueNameMx) {
		this.issueNameMx = issueNameMx;
	}
	
	@Column(name = "issue_number")
	public Integer getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(Integer issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	@Column(name = "issue_price")
	public Float getIssuePrice() {
		return issuePrice;
	}
	public void setIssuePrice(Float issuePrice) {
		this.issuePrice = issuePrice;
	}
	
	@Column(name = "issue_date_launch_jp")
	public Date getIssueDateLaunchJp() {
		return issueDateLaunchJp;
	}
	public void setIssueDateLaunchJp(Date issueDateLaunchJp) {
		this.issueDateLaunchJp = issueDateLaunchJp;
	}
	
	@Column(name = "issue_date_launch_mx")
	public Date getIssueDateLaunchMx() {
		return issueDateLaunchMx;
	}
	public void setIssueDateLaunchMx(Date issueDateLaunchMx) {
		this.issueDateLaunchMx = issueDateLaunchMx;
	}
	
	@Column(name = "issue_isbn_jp")
	public String getIssue_isbn_jp() {
		return issue_isbn_jp;
	}
	public void setIssue_isbn_jp(String issue_isbn_jp) {
		this.issue_isbn_jp = issue_isbn_jp;
	}
	
	@Column(name = "issue_isbn_mx")
	public String getIssue_isbn_mx() {
		return issue_isbn_mx;
	}
	public void setIssue_isbn_mx(String issue_isbn_mx) {
		this.issue_isbn_mx = issue_isbn_mx;
	}
	
	@ManyToMany(mappedBy = "issues")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
