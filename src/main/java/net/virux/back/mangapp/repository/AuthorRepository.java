package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer>{
	List<Author> findAll();
}
