package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Author;
import net.virux.back.mangapp.repository.AuthorRepository;
import net.virux.back.mangapp.service.AuthorService;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService{
	
	@Resource
	private AuthorRepository authorRepository;

	@Override
	public Author save(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

}
