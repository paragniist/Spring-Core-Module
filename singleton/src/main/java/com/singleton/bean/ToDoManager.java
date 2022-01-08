package com.singleton.bean;

public class ToDoManager {
	public void manage() {
		DateConverter dc = DateConverter.getInstance();
		System.out.println("DateConverter Hashcode: " + dc.hashCode());
	}

}
