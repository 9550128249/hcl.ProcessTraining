package org.hcl.collections;

public class Address {
	private String line1;
	private String line2;
	private String City;
	private String PinCode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String line1, String line2, String city, String pinCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		City = city;
		PinCode = pinCode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPinCode() {
		return PinCode;
	}
	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}
	public void display()
	{
		System.out.println("line1"+"\t"+"line2"+"\t"+"city"+"\t"+"pincode");
	}

}
