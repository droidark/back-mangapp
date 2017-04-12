package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Title;
import net.virux.back.mangapp.repository.TitleRepository;
import net.virux.back.mangapp.service.TitleService;

@Service("titleService")
public class TitleServiceImpl implements TitleService{
	
	@Resource
	private TitleRepository titleRepository;

	@Override
	public Title save(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Title> findAll() {
		return titleRepository.findAll();
	}

}
