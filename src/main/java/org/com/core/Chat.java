package org.com.core;

import org.com.model.Message;
import org.com.model.User;

import java.util.List;
import java.util.Set;

public abstract class Chat {
   Set< User > participants;
   Set< Message > messages;
   
   public abstract void addParticipant(User user);
   
   public abstract void pushMessage(Message message);
}
