package com.ust.model;

public class VendorContactPerson {
	
	private int vendor_id;
	private String vendor_name;
	private String address;
	private String location;
	private String service;
	private int pincode;
	private int cont_id;
	private String name;
	private String dept;
	private String email;
	private int isActive;
	private String phone;
	
	public VendorContactPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getCont_id() {
		return cont_id;
	}
	public void setCont_id(int cont_id) {
		this.cont_id = cont_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public VendorContactPerson(String vendor_name, String address,
			String location, String service, int pincode, String name,
			String dept, String email, int isActive, String phone) {
		super();
		this.vendor_name = vendor_name;
		this.address = address;
		this.location = location;
		this.service = service;
		this.pincode = pincode;
		this.name = name;
		this.dept = dept;
		this.email = email;
		this.isActive = isActive;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "VendorConactPerson [vendor_id=" + vendor_id + ", vendor_name="
				+ vendor_name + ", address=" + address + ", location="
				+ location + ", service=" + service + ", pincode=" + pincode
				+ ", cont_id=" + cont_id + ", name=" + name + ", dept=" + dept
				+ ", email=" + email + ", isActive=" + isActive + ", phone="
				+ phone + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
