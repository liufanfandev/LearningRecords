package com.my.layui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.my.layui.model.User;
import com.my.layui.service.UserService;
import com.my.util.Msg;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users/all",method = RequestMethod.GET)
	@ResponseBody
    public Object getAllUsers(){
		Map<String,Object> map = new HashMap<>();
		List<User> list = userService.getAllUser();
		map.put("code", 0);
		map.put("data", list);
		map.put("count", list.size()/10);
        return map;
    }
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	@ResponseBody
    public Object getUsers(Integer page,Integer limit){
		Map<String,Object> map = new HashMap<>();
		PageInfo<User> list = userService.getPageUser(page, limit);
		map.put("code", 0);
		map.put("data", list.getList());
		map.put("count", list.getTotal());
        return map;
    }
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	@ResponseBody
	public Object getUserByName(String name){
		Map<String,Object> map = new HashMap<>();
		List<User> list = userService.getUserByName(name);
		map.put("code", 0);
		map.put("data", list);
		map.put("count", list.size());
		return map;
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	@ResponseBody
	public Object addUser(User user){
		Msg msg = new Msg();
		int result = userService.addUser(user);
		if(result == 0){
			msg.setCode(0);
			msg.setMsg("添加成功！");
		}else{
			msg.setCode(-1);
			msg.setMsg("添加失败！");
		}
		return msg;
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.PUT)
	@ResponseBody
	public Object updateUser(User user){
		Msg msg = new Msg();
		int result = userService.update(user);
		if(result == 0){
			msg.setCode(0);
			msg.setMsg("修改成功！");
		}else{
			msg.setCode(-1);
			msg.setMsg("修改失败！");
		}
		return msg;
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.DELETE)
	@ResponseBody
	public Object updateUser(Integer id){
		Msg msg = new Msg();
		int result = userService.deleteById(id);
		if(result == 0){
			msg.setCode(0);
			msg.setMsg("删除成功！");
		}else{
			msg.setCode(-1);
			msg.setMsg("删除失败！");
		}
		return msg;
	}
}
