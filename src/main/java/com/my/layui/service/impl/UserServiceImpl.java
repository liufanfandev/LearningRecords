package com.my.layui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.layui.dao.UserMapper;
import com.my.layui.model.User;
import com.my.layui.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAllUser() {
		return userMapper.selectAll();
	}

	@Override
	public PageInfo<User> getPageUser(int pageNum,int pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userMapper.selectAll();
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	
	

}
