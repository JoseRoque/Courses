package com.josejroque.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}

// Spring: container for all code ran on app server
// app context created and class path scan performed b/c
// custom POJO are annotated (service, restcontroller, etc)
// other meta data present which tells how service, controller are to behave

// Bill of Materials: out of box dependecies
// tomcat - server container

// controller has uri and http method, mapped to functionality

// REST API
// what are resources? nouns/entities
// look at way consumers access API