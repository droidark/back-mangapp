package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{
	List<Profile> findAll();
}
