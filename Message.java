package projects.simplified_social_network_simulation;

import java.util.Date;
/*
 This class is used to handle
 the private messages between users
 */
public class Message {
    private String content;
    private UserProfile sender;
    private UserProfile receiver;
    private Date timestamp;

    public Message(String content, UserProfile sender, UserProfile receiver) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = new Date();
    }
}

