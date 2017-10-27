package com.josejroque.springbootquickstart.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService; // marked as need dependency injection
	
	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	// converted to JSON auto
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{id}")
	public Topic getTopic(@PathVariable final String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics")
	public void addTopic(@RequestBody Topic topic, @PathVariable final String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable final String id) {
		topicService.deleteTopic(id);
	}
}
