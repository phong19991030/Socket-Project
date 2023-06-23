/**
 * 
 */
package com.example.websocket.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.websocket.dao.MessageMapper;
import com.example.websocket.model.MessageModel;

/**
 * @author PhongNc 4:25:21 PM : Jun 14, 2023
 */
@Service
public class MessageService {

	@Autowired
	private MessageMapper messageMapper;

	public boolean saveMesage(MessageModel messageModel) throws Exception {
		Integer insertMessage = messageMapper.insertMessage(messageModel);
		return insertMessage > 0 ? true : false;
	}

	public boolean deleteMessageById(String messageId) throws Exception {
		Integer deleteMessageById = messageMapper.deleteMessageById(messageId);
		return deleteMessageById > 0 ? true : false;
	}

	public List<MessageModel> getListMessage(String groupId) throws Exception {
		return messageMapper.getListMessage(groupId);
	}

}
