package com.addressBook;

public class Person {
	
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public  String state;
	public String mobileNum;
	public long zipCode;
	
	public Person(String firstName, String lastName,String address,String city,String state,String mobileNum,long zipCode)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNum = mobileNum;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	public String toString()
	{
		return "Name: "+firstName+" "+lastName+"  Address: "+address+"  City: "+city+"  State: "+state+"  Pin Code: "+zipCode+"  Mobile Number: "+mobileNum;

	}
}



