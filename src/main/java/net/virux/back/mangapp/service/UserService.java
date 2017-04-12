package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.User;

public interface UserService {
	User save(User user);
	User delete(Integer id);
	List<User> findAll();
	User findByIdUser(Integer id);
	User findByUsername(String username);
}
