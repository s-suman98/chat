package org.com.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
  private int id;
  private  String name;
  private  String phoneNo;
  
  public  void  readMessage(Message message){
    
    System.out.println ("Message ✅"+message.getContent () +"is Read by "+this.name);;
    
  }
  
}
