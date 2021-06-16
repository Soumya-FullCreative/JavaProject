package io.full.soumya.p3;

public class ElectronicDevice {
	public static String deviceName;
	
	public String ownerName;
	public String ownerAddress;
	
	private long imeiNo;

	public static String getDeviceName() {
		return deviceName;
	}

	public static void setDeviceName(String deviceName) {
		ElectronicDevice.deviceName = deviceName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public long getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(long imeiNo) {
		this.imeiNo = imeiNo;
	}

	
	

}
