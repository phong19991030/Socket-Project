/**
 * 
 */
package com.example.websocket.dao;

import java.util.List;

import com.example.websocket.model.User;

/**
 * @author PhongNc
 *	9:20:47 AM : Jun 14, 2023 
 */
public interface UserMapper {
	Integer checkUser(User user);

    User findByUserName(String userName);
    
    List<User> findByGroupId(String groupId);
	
}
