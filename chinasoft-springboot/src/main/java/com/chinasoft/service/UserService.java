package com.chinasoft.service;

import java.util.List;

import com.chinasoft.pojo.User;

public interface UserService {
	public List<User> queryUserList();
	List<User> queryUserByPage(Integer page, Integer rows);
}
