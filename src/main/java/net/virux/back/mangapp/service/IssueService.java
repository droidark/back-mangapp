package net.virux.back.mangapp.service;

import java.util.List;

import net.virux.back.mangapp.model.Issue;

public interface IssueService {
	Issue save(Issue issue);
	Issue delete(Integer id);
	List<Issue> findAll();
}
