package com.spaneos.sp.Dao;

public class IrpInformation {
	private int irpId;
	private String irpBatch;
	private String status;
	private String remarks;
	public int getIrpId() {
		return irpId;
	}
	public void setIrpId(int irpId) {
		this.irpId = irpId;
	}
	public String getIrpBatch() {
		return irpBatch;
	}
	public void setIrpBatch(String irpBatch) {
		this.irpBatch = irpBatch;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	@Override
	public String toString() {
		return "IrpInformation [irpId=" + irpId + ", irpBatch=" + irpBatch
				+ ", status=" + status + ", remarks=" + remarks + "]";
	}
	
	
	

}
