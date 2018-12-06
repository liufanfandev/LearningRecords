package com.my.layui.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.my.layui.model.User;

public interface UserService {

	List<User> getAllUser();
	
	PageInfo<User> getPageUser(int pageNum,int pageSize);
	
	User getUserById(int id);
	
	int deleteById(int id);
	
	int update(User user);
	
	int addUser(User user);
	
	List<User> getUserByName(String name);
}
