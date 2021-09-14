package com.example.demo.service.impl;

import com.example.demo.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public String getUserName(String name) {
		System.out.println(name);
		return name;
	}

}
