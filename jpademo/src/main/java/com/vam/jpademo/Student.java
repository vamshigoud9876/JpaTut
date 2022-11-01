package com.vam.jpademo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {

	@Id
	private int stId;
	private String stName;
	private int stAge;
	private String stAddr;
	
		
	public Student(int stId, String stName, int stAge, String stAddr) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stAge = stAge;
		this.stAddr = stAddr;
	}
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStAge() {
		return stAge;
	}
	public void setStAge(int stAge) {
		this.stAge = stAge;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stAge=" + stAge + ", stAddr=" + stAddr + "]";
	}
}
