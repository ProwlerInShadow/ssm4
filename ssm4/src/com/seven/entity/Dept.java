package com.seven.entity;

public class Dept {
	private int deptId;
	private String deptName;
	private String deptAddress;
	private String newString;
	public int getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress + "]";
	}
	
}
