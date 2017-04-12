package net.virux.back.mangapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.Profile;
import net.virux.back.mangapp.repository.ProfileRepository;
import net.virux.back.mangapp.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService{
	
	@Resource
	private ProfileRepository profileRepository;

	@Override
	public Profile save(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> findAll() {
		return profileRepository.findAll();
	}

}
