package com.gyakorlas.gyak.user.businessLogic.service;

import java.util.Optional;

import org.apache.jasper.runtime.ExceptionUtils;
import org.springframework.stereotype.Service;

import com.gyakorlas.gyak.user.DAO.repo.UserRepository;
import com.gyakorlas.gyak.user.businessLogic.entity.UserEntity;

@Service
public class UserDetailsServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(UserEntity user) {
		userRepository.save(user);
	}
	
	public UserEntity findUser(String ID){
		
		UserEntity user = userRepository.findById(ID).orElseThrow(IllegalArgumentException::new);
		return user;
	}

	@Override
	public void findUserByEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
