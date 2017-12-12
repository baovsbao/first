package com.chinasoft.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> queryUserList(){
		List<User> list = userService.queryUserList();
		
		return list;
	}
	
	@RequestMapping("list/{page}/{rows}")
    @ResponseBody
	public List<User> queryUserByPage(@PathVariable Integer page, @PathVariable Integer rows) {
		List<User> list = this.userService.queryUserByPage(page, rows);
		return list;
	}

	
}
