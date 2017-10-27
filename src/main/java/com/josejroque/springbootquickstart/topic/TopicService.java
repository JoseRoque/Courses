package com.josejroque.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	// services usually singletons, java bean
	
	private List<Topic> topics = new ArrayList<Topic>( Arrays.asList( 
			new Topic("python", "PEP8", "python standard"),
			new Topic("java", "Effective Java", "Java gotchas"),
			new Topic("C", "C programming language", "Intro to programming")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream()
				.filter((topic) -> topic.getId().equals(id))
				.findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int index=0;index < topics.size(); index++) {
			if(topics.get(index).getId().equals(id)) {
				topics.set(index, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf((t) -> t.getId().equals(id));
	}
}
