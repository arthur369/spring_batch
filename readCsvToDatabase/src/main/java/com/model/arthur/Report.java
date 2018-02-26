package com.model.arthur;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="report")
public class Report {
	private String first;
	private String second;
	private String third;
	
	@XmlElement(name="first")
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	
	@XmlElement(name="second")
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	@XmlElement(name="third")
	public String getThird() {
		return third;
	}
	public void setThird(String third) {
		this.third = third;
	}
	
	
	
	public String toString() {
		return first+" , "+second+" , "+third;
	}
	
}
