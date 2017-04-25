package net.virux.back.mangapp.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.virux.back.mangapp.model.User;
import net.virux.back.mangapp.repository.UserRepository;
import net.virux.back.mangapp.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Resource
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String login(User user) {
		
		User tmpUsr;
		String token = "";
		
		// 	CHECK IF USER EXIST
		tmpUsr = userRepository.findByUsername(user.getUsername());
		
		if(tmpUsr == null){
			System.out.println("Use doesn't exist");
		}
		
		if(!passwordEncoder.matches(user.getPassword(), tmpUsr.getPassword())){
			System.out.println("no match");
		} else{
			try {
				token = Jwts.builder().setSubject(tmpUsr.getUsername())
						.claim("roles", "user").setIssuedAt(new Date())
						.signWith(SignatureAlgorithm.HS512, "secretkey".getBytes("UTF-8"))
						.compact();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return token;
	}

}
