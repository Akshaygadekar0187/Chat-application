package com.AMGapp.chatroom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private String username;
    private String content;
	public String getUsername() {
		// TODO Auto-generated method stub
		return  username;
	}
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}