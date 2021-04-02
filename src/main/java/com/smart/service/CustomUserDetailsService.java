package com.smart.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService 
{

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		if(username.equals("ram"))
		{
			return new User("ram","rama", new ArrayList());
		}else{
			throw new UsernameNotFoundException("USer not foud :( ");
		}
		
	}
	

}
