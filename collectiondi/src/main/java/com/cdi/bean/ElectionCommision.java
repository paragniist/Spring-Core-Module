package com.cdi.bean;

import java.util.Map;

public class ElectionCommision {
	private Map<String, Person> electrolList;


	public void setElectrolList(Map<String, Person> electrolList) {
		this.electrolList = electrolList;
	}


	@Override
	public String toString() {
		return "ElectionCommision [electrolList=" + electrolList + "]";
	}
	
	

		

}
