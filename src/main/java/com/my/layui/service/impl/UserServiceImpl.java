package com.my.layui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.layui.dao.UserMapper;
import com.my.layui.model.User;
import com.my.layui.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAll() {
		
		return userMapper.selectAll();
	}

}
