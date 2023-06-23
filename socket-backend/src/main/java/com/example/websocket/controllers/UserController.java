/**
 * 
 */
package com.example.websocket.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.websocket.dao.UserMapper;
import com.example.websocket.model.User;
import com.example.websocket.server.UserService;

/**
 * @author PhongNc
 *	9:55:16 AM : Jun 14, 2023 
 */
@RestController
@CrossOrigin
public class UserController {
	
 @Autowired 
 private UserService service;
	
	@RequestMapping(value = "login",method = {RequestMethod.POST})
	public Map<String, Object> getLogin(@RequestBody User user ){
		Map<String, Object> result = new HashMap<>();
		try {
			Boolean checkUser = service.checkUser(user);
			result.put("checkUser", checkUser);
			if(checkUser) {
				User findByUserName = service.findByUserName(user.getUserName());
				result.put("user", findByUserName);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
