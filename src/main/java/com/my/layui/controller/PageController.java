package com.my.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class PageController {

	@RequestMapping("/layui")
    public String layui(){
        return "layui/main";
    }
	
	@RequestMapping("/layui/user")
    public String layuiUser(){
        return "layui/user";
    }
}
