package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Issue;
import net.virux.back.mangapp.repository.IssueRepository;
import net.virux.back.mangapp.service.IssueService;

@Service("issueService")
public class IssueServiceImpl implements IssueService{

	@Resource
	private IssueRepository issueRepository;
	
	@Override
	public Issue save(Issue issue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Issue delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Issue> findAll() {
		return issueRepository.findAll();
	}

}
