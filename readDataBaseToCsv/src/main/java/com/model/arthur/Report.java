package com.model.arthur;

public class Report {

	private String first;
	private String second;
	private String third;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getThird() {
		return third;
	}
	public void setThird(String third) {
		this.third = third;
	}
	
	
	public String toString() {
		return "get "+first+","+second+","+third;
	}
	
}
