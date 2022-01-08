package com.ucdi.beans;

import java.util.List;

public class Contract {
	private int contractNo;
	private String titles;
	private List<String> works;
	
	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public void setWorks(List<String> works) {
		this.works = works;
	}
	
	@Override
	public String toString() {
		return "Contract [contractNo=" + contractNo + ", titles=" + titles + ", works=" + works + ", worksType : "
	+ works.getClass().getCanonicalName() +"]";
	}
	

}
