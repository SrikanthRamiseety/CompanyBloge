package com.spaneos.sp.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DaoImp implements DaoInf {
	 
	Connection con=null;
	Statement smt=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	@Override
	public List<IrpInformation> viewDetail() {
		List<IrpInformation> list=new ArrayList<IrpInformation>();
		IrpInformation information;
		 
		try {
			con=DaoUtil.getObject().getConnection();
			smt=con.createStatement();
			rs=smt.executeQuery(SELECT_QUERY);
			while(rs.next()){
				information=new IrpInformation();
				information.setIrpId(rs.getInt("irpId"));
				information.setIrpBatch(rs.getString("irpBatch"));
				information.setStatus(rs.getString("status"));
				information.setRemarks(rs.getString("remarks"));
				 
				list.add(information);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean addIrpInfo(IrpInformation irpInformation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIrpInfoByIrpId(int irpId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateIrpinfo(IrpInformation irpInformation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIrpinfoByIrpId(int irpId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
