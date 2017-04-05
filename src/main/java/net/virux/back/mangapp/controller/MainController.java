package net.virux.back.mangapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.virux.back.mangapp.model.User;
import net.virux.back.mangapp.service.UserService;

@RestController
public class MainController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<String> main(){
		
		User u = new User();
		u.setUsername("lordCabula");
		u.setPassword("123123");
		u.setEmail("fozz@abc.xyz");
		u.setAvatar("avatar");
		u.setCover("cover");
		u.setBio("bio");
		u.setSignUpDate(new Date());
		u.setIpAddress("123.456.789.098");
		u.setState("Offline");
		
		userService.save(u);
		
		List<String> list = new ArrayList<String>();
//		Integer i = userService.findAll().size();
//		list.add(i.toString());
		list.add("Dragon Ball Z");
		list.add("Dragon Ball GT");
		list.add("Dragon Ball Super");
		return list;
	}
}
