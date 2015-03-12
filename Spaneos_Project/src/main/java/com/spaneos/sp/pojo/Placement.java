package com.spaneos.sp.pojo;

import java.sql.Date;
import java.util.List;

public class Placement {
	private int id;
	private Date date;
	private String companyName;
	private String time;
	private String venue;
	private String req;
	private String no_of_rounds;
	List<interview> pilist;
	 
	private String Domain;
	private String Designation;
	private String exp;
	
	private int no_of_Days_show;
	
	
	
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	 
	public String getNo_of_rounds() {
		return no_of_rounds;
	}
	public void setNo_of_rounds(String no_of_rounds) {
		this.no_of_rounds = no_of_rounds;
	}
	public List<interview> getPilist() {
		return pilist;
	}
	public void setPilist(List<interview> pilist) {
		this.pilist = pilist;
	}
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
	 
	public int getNo_of_Days_show() {
		return no_of_Days_show;
	}
	public void setNo_of_Days_show(int no_of_Days_show) {
		this.no_of_Days_show = no_of_Days_show;
	}
	

}
