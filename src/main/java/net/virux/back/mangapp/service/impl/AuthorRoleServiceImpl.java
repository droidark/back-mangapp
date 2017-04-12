package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.AuthorRole;
import net.virux.back.mangapp.repository.AuthorRoleRepository;
import net.virux.back.mangapp.service.AuthorRoleService;

@Service("authorRoleService")
public class AuthorRoleServiceImpl implements AuthorRoleService{

	@Resource
	private AuthorRoleRepository authorRoleRepository;
	
	@Override
	public AuthorRole save(AuthorRole authorRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorRole delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthorRole> findAll() {
		return authorRoleRepository.findAll();
	}

}
