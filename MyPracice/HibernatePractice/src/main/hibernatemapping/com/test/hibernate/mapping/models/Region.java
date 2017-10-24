package com.test.hibernate.mapping.models;

public  final class Region {

	private Integer regionId;
	private String regionName;
	private Integer tcSerialNo;

	public Integer getTcSerialNo() {
		return tcSerialNo;
	}

	public void setTcSerialNo(Integer tcSerialNo) {
		this.tcSerialNo = tcSerialNo;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	

/*	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName
				+ ", tcSerialNo=" + tcSerialNo + "]";
	}*/

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
