package com.example.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import com.example.websocket.model.UserInterceptor;


@Configuration
@EnableWebSocketMessageBroker
public class MessageConfigaration implements WebSocketMessageBrokerConfigurer {
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
	registry.addEndpoint("/msSocket").setAllowedOrigins("http://localhost:3000").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// prefix client subcribe
	registry.enableSimpleBroker("queue");
	// prefix client to server
	registry.setApplicationDestinationPrefixes("/app");
	registry.setUserDestinationPrefix("/users");
	}
	
	@Override
	public void configureClientInboundChannel(ChannelRegistration registration) {
	registration.interceptors(new UserInterceptor());
	}
	
}
