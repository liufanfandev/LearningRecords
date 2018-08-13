package com.my.layui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.layui.model.User;
import com.my.layui.service.UserService;

@RestController
public class HelloController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
    public Object login(){
		List<User> list = userService.getAll();
		
        return list;
    }
	
	
}
