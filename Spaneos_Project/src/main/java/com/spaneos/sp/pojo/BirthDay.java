package com.spaneos.sp.pojo;

import java.util.Date;


public class BirthDay {
	private int id;
	private Date date;

	private String name;
	private String what;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	@Override
	public String toString() {
		return "BirthDay [id=" + id + ", date=" + date + ", name=" + name
				+ ", what=" + what + "]";
	}

}
