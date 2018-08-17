package com.my.layui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.layui.dao.UserMapper;
import com.my.layui.model.User;
import com.my.layui.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

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
		Example example = new Example(User.class);
		example.setOrderByClause("id desc");
		List<User> list = userMapper.selectByExample(example);
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public User getUserById(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public int deleteById(int id) {
		int result = userMapper.deleteByPrimaryKey(id);
		return result;
	}

	@Override
	public int update(User user) {
		int result = userMapper.updateByPrimaryKey(user);
		return result;
	}

	@Override
	public int addUser(User user) {
		int result = userMapper.insert(user);
		return result;
	}

	@Override
	public List<User> getUserByName(String name) {
		Example example = new Example(User.class);
		Criteria criteria = example.createCriteria();
		criteria.andLike("name", name);
		List<User> list = userMapper.selectByExample(example);
		
		return list;
	}
	
	

}
