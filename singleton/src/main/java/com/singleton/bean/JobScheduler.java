package com.singleton.bean;

public class JobScheduler {
	public void execute() {
		DateConverter dConverter = DateConverter.getInstance();
		System.out.println("DateConverter Hashcode: " + dConverter.hashCode());
		
	}

}
