package org.com;

import org.com.core.Chat;
import org.com.core.GroupChat;
import org.com.core.OnetoOneChat;
import org.com.model.Message;
import org.com.model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String[] args){
	
	
	User user1= User.builder().id (1).name ("anish").phoneNo ("7488810720").build ();
	User user2= User.builder().id (2).name ("manish").phoneNo ("9955707410").build ();
	User user3= User.builder().id (3).name ("mohan").phoneNo ("8899009990").build ();
	User user4= User.builder().id (4).name ("satish").phoneNo ("8179421456").build ();
	
	
	GroupChat groupChat=new GroupChat ();
	groupChat.setGroupName ("Durga puja 2026");
	
	groupChat.addParticipant (user2);
	groupChat.addParticipant (user3);
	groupChat.addParticipant (user4);
	
	
	Message message=new Message ();
	  message.setId (1);
	  message.setSender (user1);
	  message.setContent ("All the best to all for durga puja");
	  
//	  groupChat.pushMessage (message);
	
	
	OnetoOneChat onetoOneChat=new OnetoOneChat ();
	
	  onetoOneChat.addParticipant (user2);
	  
	  onetoOneChat.pushMessage (message);
	  
	  

	}

}