package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Author;

public interface AuthorService {
	Author save(Author author);
	Author delete(Integer id);
	List<Author> findAll();
}
