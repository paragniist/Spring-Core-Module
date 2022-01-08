package com.ba.beans;

public class Person {
	
	private int personNo;
	private String personNameString;
	private int age;
	private String gender;
	
	
	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	public void setPersonNameString(String personNameString) {
		this.personNameString = personNameString;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personNameString=" + personNameString + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	
	
	

}
