/**
 * 
 */
package com.example.websocket.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.websocket.dao.UserMapper;
import com.example.websocket.model.User;

/**
 * @author PhongNc 9:58:30 AM : Jun 14, 2023
 */

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	public User findByUserName(String userName) {
		return mapper.findByUserName(userName);
	}
	
	public List<User> findByGroupId(String groupId) {
		return mapper.findByGroupId(groupId);
	}

	public Boolean checkUser(User user) {
		Integer checkUser = mapper.checkUser(user);
		return checkUser > 0 ? true : false;
	}

}
