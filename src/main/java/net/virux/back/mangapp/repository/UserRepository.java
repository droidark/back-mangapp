package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	List<User> findAll();
	User findByIdUser(Integer id);
	User findByUsername(String username);
}
