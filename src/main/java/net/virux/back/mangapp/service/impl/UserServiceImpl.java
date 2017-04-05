package net.virux.back.mangapp.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.virux.back.mangapp.model.User;
import net.virux.back.mangapp.repository.UserRepository;
import net.virux.back.mangapp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		System.out.println(userRepository.findByUsername(user.getUsername()));
		if (findByUsername(user.getUsername()) == null) {
//			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setSignUpDate(new Date());
			user.setState("Pending");
//			Set<Profile> profiles = new HashSet<Profile>();
//			profiles.add(profileService.get(2));
//			user.setProfiles(profiles);
			userRepository.save(user);
		}
		return null;
	}

	@Override
	public User delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByIdUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	} 
}
