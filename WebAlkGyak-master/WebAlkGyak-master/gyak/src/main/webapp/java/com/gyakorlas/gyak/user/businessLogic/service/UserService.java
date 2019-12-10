package com.gyakorlas.gyak.user.businessLogic.service;

import java.util.Optional;

import com.gyakorlas.gyak.user.businessLogic.entity.UserEntity;

public interface UserService {
		
	public void createUser(UserEntity user);
	public void findUserByEmail(String email);
	public UserEntity findUser(String ID);
	
}
