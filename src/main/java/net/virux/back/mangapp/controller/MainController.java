package net.virux.back.mangapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.virux.back.mangapp.model.Author;
import net.virux.back.mangapp.model.AuthorRole;
import net.virux.back.mangapp.model.Demographic;
import net.virux.back.mangapp.model.Editorial;
import net.virux.back.mangapp.model.Issue;
import net.virux.back.mangapp.model.Profile;
import net.virux.back.mangapp.model.Title;
import net.virux.back.mangapp.model.User;
import net.virux.back.mangapp.service.AuthorRoleService;
import net.virux.back.mangapp.service.AuthorService;
import net.virux.back.mangapp.service.DemographicService;
import net.virux.back.mangapp.service.EditorialService;
import net.virux.back.mangapp.service.IssueService;
import net.virux.back.mangapp.service.ProfileService;
import net.virux.back.mangapp.service.TitleService;
import net.virux.back.mangapp.service.UserService;

@RestController
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private AuthorRoleService authorRoleService;
	
	@Autowired
	private DemographicService demographicService;
	
	@Autowired
	private EditorialService editorialService;
	
	@Autowired
	private IssueService issueService;
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private TitleService titleService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<String> main(){
		
//		User u = new User();
//		u.setUsername("droidark");
//		u.setPassword("123123");
//		u.setEmail("fozz@abc.xyz");
//		u.setAvatar("avatar");
//		u.setCover("cover");
//		u.setBio("bio");
//		u.setSignUpDate(new Date());
//		u.setIpAddress("123.456.789.098");
//		u.setState("Offline");
		
//		userService.save(u);
		
//		USERS
//		List<User> users = userService.findAll();
//		System.out.println(users.get(0).getProfiles().size());
//		System.out.println(users.get(0).getTitles().size());
//		System.out.println(users.get(0).getIssues().size());
		
//		AUTHOR
//		List<Author> authors = authorService.findAll();
//		System.out.println(authors.get(0).getTitles().size());
//		System.out.println(authors.get(0).getAuthorRoles().size());
		
//		AUTHOR ROLE
//		List<AuthorRole> roles = authorRoleService.findAll();
//		System.out.println(roles.get(0).getAuthors().size());
		
//		DEMOGRAPHIC
//		List<Demographic> demographic = demographicService.findAll();
//		System.out.println(demographic.get(0).getTitles());
		
//		EDITORIAL
//		List<Editorial> editorials = editorialService.findAll();
//		System.out.println(editorials.get(0).getTitles().size());
		
//		ISSUE
//		List<Issue> issues = issueService.findAll();
//		System.out.println(issues.get(0).getTitle().getTitleName());
//		System.out.println(issues.get(0).getUsers());
		
//		PROFILE
//		List<Profile> profiles = profileService.findAll();
//		System.out.println(profiles.get(0).getUsers());
		
		List<Title> titles = titleService.findAll();
		System.out.println(titles.get(0).getEditorial().getEditorialName());
		System.out.println(titles.get(0).getIssues().size());
		System.out.println(titles.get(0).getAuthors().size());
		System.out.println(titles.get(0).getUsers().size());
		
		
		List<String> list = new ArrayList<String>();
//		Integer i = userService.findAll().size();
//		list.add(i.toString());
		list.add("Dragon Ball Z");
		list.add("Dragon Ball GT");
		list.add("Dragon Ball Super");
		return list;
	}
}
