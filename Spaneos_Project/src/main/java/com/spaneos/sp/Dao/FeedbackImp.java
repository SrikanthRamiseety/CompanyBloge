package com.spaneos.sp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.spaneos.sp.pojo.Feedback;

public class FeedbackImp implements FeedbackInf {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	@Override
	public boolean addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		con=DaoUtil.getObject().getConnection();
		List<Feedback> flist=new ArrayList<Feedback>();
		try {
			pst=con.prepareStatement("select * from feedback");
			rs=pst.executeQuery();
			while(rs.next()){
				Feedback feedback=new Feedback();
				feedback.setName(rs.getString("name"));
				feedback.setEmail(rs.getString("email"));
				feedback.setMessage(rs.getString("message"));
				feedback.setWorkfor(rs.getString("workfor"));
				feedback.setMobile(rs.getString("mobile"));
				flist.add(feedback);
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		return flist;
	}

}
