package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Editorial;

public interface EditorialRepository extends CrudRepository<Editorial, Integer>{
	List<Editorial> findAll();
}
