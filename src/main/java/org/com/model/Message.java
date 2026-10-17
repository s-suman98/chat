package org.com.model;


import lombok.Data;

@Data
public class Message {

private int id;
private String content;

private User sender;
}
