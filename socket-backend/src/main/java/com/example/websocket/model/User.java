/**
 * 
 */
package com.example.websocket.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PhongNc 9:21:37 AM : Jun 14, 2023
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Long userId;
	private String userName;
	private List<GroupModel> listGroup;
	private String groupName;
	private String adrres;
	private String cellPhone;
	private String dob;
	private String email;
	private String fullName;
	private String gender;
	private String password;

}
