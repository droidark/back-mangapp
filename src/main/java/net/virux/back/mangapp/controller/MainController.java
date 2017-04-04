package net.virux.back.mangapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<String> main(){
		List<String> list = new ArrayList<String>();
		list.add("Dragon Ball");
		list.add("Dragon Ball Z");
		list.add("Dragon Ball GT");
		list.add("Dragon Ball Super");
		return list;
	}
}
