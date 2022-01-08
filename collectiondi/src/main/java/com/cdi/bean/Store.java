package com.cdi.bean;

import java.util.Set;

public class Store{

	private int storeNo;
	private String storeName;
	private String location;
	private Set<Staff> staffs;
	
	
	public Store(int storeNo) {
		super();
		this.storeNo = storeNo;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public String toString() {
		return "Store [storeNo=" + storeNo + ", storeName=" + storeName + ", location=" + location + ", staffs="
				+ staffs + "]";
	}
	
	
	
	
}
