package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.User;
import com.bank.repository.UserRepository;
@Service
public class UserService {
	@Autowired 
	private UserRepository userRepository;

	public User insertUser(User user) {
		return userRepository.save(user);
	}

}
