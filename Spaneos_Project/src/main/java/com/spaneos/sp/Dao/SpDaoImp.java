package com.spaneos.sp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.spaneos.sp.pojo.Placement;

public class SpDaoImp implements SpDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePlacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Placement getPlacement(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Placement> getAllPlacements() {
		List<Placement> plist=new ArrayList<Placement>();
		con=DaoUtil.getObject().getConnection();
		
		try {
			pstmt=con.prepareStatement("select * from placement ");
			rs=pstmt.executeQuery();
			while(rs.next()){
				Placement placement=new Placement();
				 placement.setId(rs.getInt(1));
				 placement.setCompanyName(rs.getString("Cname"));
				 placement.setDate(rs.getDate(3));
				 placement.setTime(rs.getString("time"));
				 placement.setVenue(rs.getString("vanue"));
				 placement.setDesignation(rs.getString("denation"));
				 placement.setDomain(rs.getString("domain"));
				 placement.setReq(rs.getString("req"));
				 placement.setExp(rs.getString("exce"));
				 
				 
				plist.add(placement);
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
		return plist;
	}

}
