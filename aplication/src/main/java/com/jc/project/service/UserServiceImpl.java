package com.jc.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jc.project.entity.User;
import com.jc.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public Iterable getAllUsers(){
		return userRepository.findAll();
	}
	
}