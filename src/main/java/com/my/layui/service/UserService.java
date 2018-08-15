package com.my.layui.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.my.layui.model.User;

public interface UserService {

	List<User> getAllUser();
	
	PageInfo<User> getPageUser(int pageNum,int pageSize);
}
