package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Demographic;

public interface DemographicRepository extends CrudRepository<Demographic, Integer>{
	List<Demographic> findAll();
}
