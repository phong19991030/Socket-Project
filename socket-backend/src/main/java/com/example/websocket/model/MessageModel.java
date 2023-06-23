/**
 * 
 */
package com.example.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PhongNc
 *	11:48:51 AM : Jun 14, 2023 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {
	private String messageId;
	private Integer insId;
	private String insDt;
	private String groupId;
	private String userName;
	private String content;
//	private String receiver;

}
