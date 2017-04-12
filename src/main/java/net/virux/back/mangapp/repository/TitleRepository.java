package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Title;

public interface TitleRepository extends CrudRepository<Title, Integer>{
	List<Title> findAll();
}
