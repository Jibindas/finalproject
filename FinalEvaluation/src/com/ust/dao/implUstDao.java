package com.ust.dao;

import java.util.List;

import com.ust.model.User;
import com.ust.model.VendorContactPerson;

public interface implUstDao {

	public abstract User selectRole(String username, String password);

	public abstract List<VendorContactPerson> getVendor();

	public abstract List<VendorContactPerson> getVendorByName(String vendor_name);

	//get vendor details by id
	public abstract VendorContactPerson getVendorById(int vendor_id);

	public abstract int saveVendor(VendorContactPerson vc);

	//update vendor
	public abstract int updateVendor(int vendor_id, VendorContactPerson vc);

	public abstract VendorContactPerson getContactDetailsByVId(int vid);

	//to disable a vendor
	public abstract int disableVendor(int vId);

}