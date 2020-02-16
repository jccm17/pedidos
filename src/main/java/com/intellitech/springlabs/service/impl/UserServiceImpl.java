package com.intellitech.springlabs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intellitech.springlabs.model.User;
import com.intellitech.springlabs.repository.UserRepository;
import com.intellitech.springlabs.service.UserService;

import javassist.tools.rmi.ObjectNotFoundException;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional(readOnly = true)
	public User findByUsernameOrEmail(String usernameOrEmail) {
		try {
			User user = userRepository.findByUsernameOrEmail(usernameOrEmail);
			return user;
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	@Transactional(readOnly = true)
	public User findById(Long id) throws ObjectNotFoundException {
		User user = userRepository.findOne(id);
		if (user == null) {
			throw new ObjectNotFoundException("User not found");
		}
		return user;
	}

}
