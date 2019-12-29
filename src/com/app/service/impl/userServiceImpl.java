package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.userMapper;
import com.app.pojo.dec_user;
import com.app.service.userService;

@Service
public class userServiceImpl implements userService{
	@Autowired
	private userMapper userMappers;
	
	@Override
	public List<dec_user> allUsers(){
		return userMappers.selectAll();
	}
	
}
