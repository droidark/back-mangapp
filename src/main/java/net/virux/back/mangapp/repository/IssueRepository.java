package net.virux.back.mangapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.virux.back.mangapp.model.Issue;

public interface IssueRepository extends CrudRepository<Issue, Integer>{
	List<Issue> findAll();
}
