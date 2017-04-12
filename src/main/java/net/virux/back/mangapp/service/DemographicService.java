package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Demographic;

public interface DemographicService {
	Demographic save(Demographic demographic);
	Demographic delete();
	List<Demographic> findAll();
}
