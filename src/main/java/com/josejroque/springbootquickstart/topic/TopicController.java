package com.josejroque.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList( 
				new Topic("python", "PEP8", "python standard"),
				new Topic("java", "Effective Java", "Java gotchas"),
				new Topic("C", "C programming language", "Intro to programming")
				);
	}
	// converted to JSON auto
}
