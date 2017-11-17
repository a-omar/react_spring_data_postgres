package com.demo.timeline.models;

import lombok.Data;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Index;
import java.util.Date;


//@Document(collection = "message")
//@Data
//public class Message {
//    private @Id Long id;
//
//    @Indexed(unique = true)
//    private String title;
//    private String msgBody;
//    private Date pubDate;
//
//}

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String msg_body;
    private Date pub_date;

    public Message() {}

    public Message(String title, String msgBody, Date pubDate) {
        this.title = title;
        this.msg_body = msgBody;
        this.pub_date = pubDate;
    }
}