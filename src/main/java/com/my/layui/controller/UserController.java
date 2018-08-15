package com.my.layui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.my.layui.model.User;
import com.my.layui.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users/all",method = RequestMethod.GET)
    public Object getAllUsers(){
		List<User> list = userService.getAllUser();
        return list;
    }
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
    public Object getUsers(){
		PageInfo<User> list = userService.getPageUser(0, 10);
        return list;
    }
	
}
