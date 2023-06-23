/**
 * 
 */
package com.example.websocket.dao;


import java.util.List;

import com.example.websocket.model.MessageModel;

/**
 * @author PhongNc
 *	4:08:38 PM : Jun 14, 2023 
 */
public interface MessageMapper {
	
	Integer insertMessage(MessageModel messageModel)throws Exception;
	
	Integer deleteMessageById(String messageId)throws Exception;
	
	List<MessageModel>  getListMessage(String groupId)throws Exception;
	
	

}
