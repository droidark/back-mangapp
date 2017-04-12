package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.AuthorRole;

public interface AuthorRoleRepository extends CrudRepository<AuthorRole, Integer>{
	List<AuthorRole> findAll();
}
