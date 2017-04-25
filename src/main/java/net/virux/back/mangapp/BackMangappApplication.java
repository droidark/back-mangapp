package net.virux.back.mangapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import net.virux.back.mangapp.configuration.JwtFilter;

@SpringBootApplication
public class BackMangappApplication {
	
	public FilterRegistrationBean jwtFilter(){
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/rest/*");
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackMangappApplication.class, args);
	}
}
