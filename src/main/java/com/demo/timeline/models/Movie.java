package com.demo.timeline.models;

import lombok.Data;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

//@Document(collection = "movies")
//@Data
//public class Movie {
//
//    private @Id String _id;
//    private String actor_id;
//    private String title;
//
//}
@Data
@Entity
public class Movie {

    private @Id @GeneratedValue Long _id;
    private String actor_id;
    private String title;

    public Movie() {}

    public Movie(String actor_id, String title) {
        this.actor_id = actor_id;
        this.title = title;
    }
}
