package com.spaneos.sp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.spaneos.sp.pojo.BirthDay;

public class BirthdayImp implements BrithDayInf {
	Connection con=null;
	Statement smt=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	@Override
	public boolean addBrithday(BirthDay birthDay) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BirthDay> getAllDetiles() {
		List<BirthDay> blist=new ArrayList<BirthDay>();
		
		 con=DaoUtil.getObject().getConnection();
		 try {
			pstmt=con.prepareStatement("select * from birthday");
			rs=pstmt.executeQuery();
			while(rs.next()){
				BirthDay birthday=new BirthDay();
				birthday.setName(rs.getString("name"));
				birthday.setWhat(rs.getString("what"));
				birthday.setDate(rs.getDate("date"));
				blist.add(birthday);
			}
		} catch (SQLException e) {
		 
			e.printStackTrace();
		}
		return blist;
	}

}
