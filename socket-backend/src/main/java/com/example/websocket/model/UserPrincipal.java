/**
 * 
 */
package com.example.websocket.model;

import java.security.Principal;

/**
 * @author PhongNc
 *	12:38:32 PM : Jun 14, 2023 
 */
public class UserPrincipal implements Principal{

	private String name;

	public UserPrincipal(String name) {
	this.name = name;
	}

	@Override
	public String getName() {
	return name;
	}
	
}
