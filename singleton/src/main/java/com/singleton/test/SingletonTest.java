package com.singleton.test;

import com.singleton.bean.JobScheduler;
import com.singleton.bean.ToDoManager;

public class SingletonTest {
	public static void main(String[] args) {
		ToDoManager toDoManager = new ToDoManager();
		toDoManager.manage();
		
		JobScheduler jcJobScheduler = new JobScheduler();
		jcJobScheduler.execute();
	}

}
