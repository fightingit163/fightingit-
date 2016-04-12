package com.qiku.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qiku.dao.UserMapper;
import com.qiku.model.User;
import com.qiku.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public String getUser(String name) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(2);
		return "大家好，我叫" + user.getName();
	}

}
