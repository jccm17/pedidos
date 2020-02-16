package com.intellitech.springlabs.service;

import java.util.List;

import com.intellitech.springlabs.model.Role;

import javassist.tools.rmi.ObjectNotFoundException;

public interface RoleService {
	
	 List<Role> findAll()throws ObjectNotFoundException;
}
