package cdacproject.cdacproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdacproject.cdacproject.controller.response.GlobalResponse;
import cdacproject.cdacproject.dao.VendorDao;
import cdacproject.cdacproject.entity.Vendor;

@Service
public class VendorService {
	@Autowired
	private VendorDao vendorDao;
	
	public List<Vendor> getVendors() {
		return vendorDao.findAll();
	}
	
	public Vendor getVendor(Long id) {
		return vendorDao.getById(id);
	}
	
	public GlobalResponse addVendor(Vendor vendor) {
		Vendor entity = vendorDao.save(vendor);
		return new GlobalResponse(entity.getId(), "Vendor Added Successful", true);
	}
	
	public GlobalResponse updateVendor(Vendor vendor) {
		Vendor entity = vendorDao.save(vendor);
		return new GlobalResponse(entity.getId(), "Vendor Updated Successful", true);
	}
	
	public GlobalResponse deleteVendor(Long id) {
		Vendor entity = vendorDao.getById(id);
		vendorDao.delete(entity);
		return new GlobalResponse(id, "Vendor Deleted Successful", true);
	}
	
	public Vendor findByVendorname(String vendorname) {
//		Vendor entity = vendorDao.findByVendorname(vendorname);
		return vendorDao.findByUsername(vendorname);
	}
}
