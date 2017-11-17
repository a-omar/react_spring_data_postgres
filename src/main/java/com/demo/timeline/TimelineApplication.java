package com.demo.timeline;

import com.demo.timeline.models.Message;
import com.demo.timeline.models.Movie;
import com.demo.timeline.repositories.MessageRepository;
import com.demo.timeline.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class TimelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimelineApplication.class, args);

	}

	@Bean
	public  CommandLineRunner demo(MessageRepository rm) {

		return (args) -> {
			// save a couple of customers
			rm.save(new Message("First mesaage", "Message body 1 sould be long text", new Date(2017,2,2)));
			rm.save(new Message("Second mesaage", "Message body 2 sould be long text", new Date(2017,3,21)));
			rm.save(new Message("Third mesaage", "Message body 3 sould be long text", new Date(2017,11,5)));
			rm.save(new Message("Fourth mesaage", "Message body 4 sould be long text", new Date(2017,4,12)));


		};
	}

//	@Bean
//	public CommandLineRunner demo(MovieRepository mr) {
//
//		return (args) -> {
//			// save a couple of customers
//			mr.save(new Movie("actor 1", "Film 1"));
//			mr.save(new Movie("actor 2", "Film 2"));
//			mr.save(new Movie("actor 3", "Film 3"));
//			mr.save(new Movie("actor 4", "Film 4"));
//
//
//		};
//	}
}



