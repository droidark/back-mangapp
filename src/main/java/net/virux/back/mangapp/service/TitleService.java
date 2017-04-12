package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Title;

public interface TitleService {
	Title save(Title title);
	Title delete(Integer id);
	List<Title> findAll();
}
