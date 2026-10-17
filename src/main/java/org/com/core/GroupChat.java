package org.com.core;

import lombok.Data;
import org.com.model.Message;
import org.com.model.User;

import java.util.HashSet;

@Data
public class GroupChat extends Chat {

private String groupName;



public  GroupChat(){
	super.participants=new HashSet<> ();
	super.messages=new HashSet<> ();
}

@Override
public void addParticipant (User user) {
	
	super.participants.add (user);
	
}

@Override
public void pushMessage (Message message) {
	
	for(User user:super.participants){
		user.readMessage (message);
	}
	
}
}
