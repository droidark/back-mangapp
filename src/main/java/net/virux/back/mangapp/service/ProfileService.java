package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Profile;

public interface ProfileService {
	Profile save(Profile profile);
	Profile delete(Integer id);
	List<Profile> findAll();
}
