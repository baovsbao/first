package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;
import com.github.pagehelper.PageHelper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryUserList() {
		List<User> list = this.userMapper.queryUserList();
		return list;
	}
	
	//分页助手
	@Override
	public List<User> queryUserByPage(Integer page, Integer rows) {
		// 设置分页
		PageHelper.startPage(page, rows);
		List<User> list = this.userMapper.queryUserList();
		return list;
	}

}
