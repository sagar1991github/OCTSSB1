package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.velocity.repo.IUserDao;

@Service
public class UserService {
	
	private IUserDao userDao;
	@Autowired
	//@Qualifier("Dao2")
	public void setUserDao(IUserDao userDao) {
		System.out.println("Setter Based method is called");
		this.userDao = userDao;
		System.out.println("Injected Class is :"+userDao.getClass().getName());
	}
	
	public void getName(Integer id) {
		String name= userDao.findNameById(id);
		System.out.println("Nmae is"+name);
	}


	}


