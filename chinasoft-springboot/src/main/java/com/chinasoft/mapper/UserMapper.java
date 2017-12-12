package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chinasoft.pojo.User;

@Mapper
public interface UserMapper {
	public List<User> queryUserList();
}
