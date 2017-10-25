package com.josejroque.springbootquickstart.topic;

public class Topic {
	private final String id;
	private final String name;
	private final String desc;
	
	public Topic(final String id, final String name, final String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
}
