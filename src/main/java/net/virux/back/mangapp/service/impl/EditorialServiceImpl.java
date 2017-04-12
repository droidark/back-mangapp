package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Editorial;
import net.virux.back.mangapp.repository.EditorialRepository;
import net.virux.back.mangapp.service.EditorialService;

@Service("editorialService")
public class EditorialServiceImpl implements EditorialService{
	
	@Resource
	private EditorialRepository editorialRepository;

	@Override
	public Editorial save(Editorial editorial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editorial delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editorial> findAll() {
		return editorialRepository.findAll();
	}

}
