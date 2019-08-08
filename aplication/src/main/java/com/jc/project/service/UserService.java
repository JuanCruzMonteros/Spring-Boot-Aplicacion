package com.jc.project.service;

import com.jc.project.entity.User;

public interface UserService {

	public User createUser(User formUser) throws Exception;
	
	public Iterable getAllUsers();
		
}