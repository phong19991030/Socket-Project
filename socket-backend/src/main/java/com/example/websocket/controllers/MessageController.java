/**
 * 
 */
package com.example.websocket.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.stereotype.Controller;

import com.example.websocket.model.MessageModel;
import com.example.websocket.model.ResponeModel;
import com.example.websocket.model.User;
import com.example.websocket.server.MessageService;
import com.example.websocket.server.UserService;

/**
 * @author PhongNc 11:48:00 AM : Jun 14, 2023
 */

@Controller
public class MessageController {

	@Autowired
	private UserService userService;

	@Autowired
	private MessageService messageService;

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@Autowired
	private SimpUserRegistry simpUserRegistry;

	@MessageMapping("/msSocket/send")
	public void send(SimpMessageHeaderAccessor sha, @Payload MessageModel requestModel) {
		try {
			messageService.saveMesage(requestModel);
			List<MessageModel> list = messageService.getListMessage(requestModel.getGroupId());
			ResponeModel result = new ResponeModel();
			result.setList(list);
			simpMessagingTemplate.convertAndSendToUser(requestModel.getGroupId(),
					"/queue/messages" + requestModel.getGroupId(), result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@MessageMapping("/msSocket/remove")
	public void remove(SimpMessageHeaderAccessor sha, @Payload MessageModel requestModel) {
		try {
			messageService.deleteMessageById(requestModel.getMessageId());
			List<MessageModel> list = messageService.getListMessage(requestModel.getGroupId());
			ResponeModel result = new ResponeModel();
			result.setList(list);
			simpMessagingTemplate.convertAndSendToUser(requestModel.getGroupId(),
					"/queue/messages" + requestModel.getGroupId(), result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@MessageMapping("/msSocket/init")
	public void init(SimpMessageHeaderAccessor sha, @Payload MessageModel requestModel) {
		try {
			List<MessageModel> list = messageService.getListMessage(requestModel.getGroupId());
			ResponeModel result = new ResponeModel();
			result.setList(list);
			simpMessagingTemplate.convertAndSendToUser(requestModel.getGroupId().toString(),
					"/queue/messages" + requestModel.getGroupId(), result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
