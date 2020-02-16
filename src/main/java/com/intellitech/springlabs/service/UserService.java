package com.intellitech.springlabs.service;

import com.intellitech.springlabs.model.User;

import javassist.tools.rmi.ObjectNotFoundException;

public interface UserService {
	
	 User findByUsernameOrEmail(String usermaneOrEmail);
	 User findById(Long id) throws ObjectNotFoundException;
}
