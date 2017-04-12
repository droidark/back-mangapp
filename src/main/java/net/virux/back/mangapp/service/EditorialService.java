package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Editorial;

public interface EditorialService {
	Editorial save(Editorial editorial);
	Editorial delete(Integer id);
	List<Editorial> findAll();
}
