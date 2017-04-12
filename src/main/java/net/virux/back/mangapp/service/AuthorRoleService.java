package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.AuthorRole;

public interface AuthorRoleService {
	AuthorRole save(AuthorRole authorRole);
	AuthorRole delete(Integer id);
	List<AuthorRole> findAll();
}
