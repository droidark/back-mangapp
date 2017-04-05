package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.User;

public interface UserService {
	public User save(User user);
	public User delete(Integer id);
	public List<User> findAll();
	public User findByIdUser(Integer id);
	public User findByUsername(String username);
}
