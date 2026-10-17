package org.com.core;

import org.com.exception.ChatException;
import org.com.model.Message;
import org.com.model.User;

import java.util.HashSet;

public class OnetoOneChat extends Chat {



public  OnetoOneChat(){
	super.participants=new HashSet<> ();
	super.messages=new HashSet<> ();
}
@Override
public void addParticipant (User user) {
	if ( super.participants.size () > 2 ) {
		throw new ChatException ("Cant add moore than 2 on one to one chat");
	}
	super.participants.add (user);
	
}

@Override
public void pushMessage (Message message) {
	
	for(User user:super.participants){
		user.readMessage (message);
	}
	
}
}
