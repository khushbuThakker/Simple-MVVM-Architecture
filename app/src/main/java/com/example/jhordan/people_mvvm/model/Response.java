package com.example.jhordan.people_mvvm.model;

import java.util.List;

public class Response{
	private List<People> results;
	private Info info;

	public List<People> getResults(){
		return results;
	}

	public Info getInfo(){
		return info;
	}
}