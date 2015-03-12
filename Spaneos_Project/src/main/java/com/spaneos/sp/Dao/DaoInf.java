package com.spaneos.sp.Dao;

import java.util.List;

public interface DaoInf {
	List<IrpInformation> viewDetail();
	boolean addIrpInfo(IrpInformation irpInformation);
	boolean deleteIrpInfoByIrpId(int irpId);
	boolean updateIrpinfo(IrpInformation irpInformation);
	boolean getIrpinfoByIrpId(int irpId);
	String SELECT_QUERY="Select * from irpInformation";
	String SELCT_QUERY_BY_IRPID="select * from irpInformation where irpid=?";
	String ADD_IRPINFO="insert into irpInformation (irpBatch,status,remarks) value(?,?,?)";
	String UPDATE_BY_IRPID="update irpInformation set irpBatch=?,status=?,remarks=? where irpid=?";
	String DELETE_BY_IRPID="delete from irpInformation where irpId=?";
}
