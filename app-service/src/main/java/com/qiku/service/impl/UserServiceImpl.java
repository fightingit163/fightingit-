package com.qiku.service.impl;

import org.springframework.stereotype.Service;

import com.qiku.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Override
	public String getUser(String name) {
		// TODO Auto-generated method stub
		return "大家好，我叫" + name;
	}

}
