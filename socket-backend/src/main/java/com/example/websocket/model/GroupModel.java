/**
 * 
 */
package com.example.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PhongNc
 *	9:22:14 AM : Jun 16, 2023 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupModel {
	
	private Integer groupId;
	private String groupName;

}
