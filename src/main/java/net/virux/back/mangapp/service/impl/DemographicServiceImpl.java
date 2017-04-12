package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Demographic;
import net.virux.back.mangapp.repository.DemographicRepository;
import net.virux.back.mangapp.service.DemographicService;

@Service("demographicService")
public class DemographicServiceImpl implements DemographicService{
	
	@Resource
	private DemographicRepository demographicRepository;

	@Override
	public Demographic save(Demographic demographic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demographic delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Demographic> findAll() {
		return demographicRepository.findAll();
	}

}
