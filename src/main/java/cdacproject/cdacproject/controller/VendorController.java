package cdacproject.cdacproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cdacproject.cdacproject.entity.Vendor;
import cdacproject.cdacproject.response.GlobalResponse;
import cdacproject.cdacproject.service.VendorService;
@RestController
@CrossOrigin(origins = "*")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/vendors")
	public  List<Vendor> getVendors() {
		return vendorService.getVendors();
	}
	
	@GetMapping("/vendors/{vendorId}")
	public Vendor getVendor(@PathVariable String vendorId) {
		return vendorService.getVendor(Long.parseLong(vendorId));
	}
	
	@PostMapping("/vendors")
	public GlobalResponse addVendor(@RequestBody Vendor vendor) {
		return vendorService.addVendor(vendor);
	}
	
	@PutMapping("/vendors")
	public GlobalResponse updateVendor(@RequestBody Vendor vendor) {
		return vendorService.updateVendor(vendor);
	}
	
	@DeleteMapping("/vendors/{vendorId}")
	public GlobalResponse deleteVendor(@PathVariable String vendorId) {
		return vendorService.deleteVendor(Long.parseLong(vendorId));
	}
	
	@GetMapping("/vendors/vendorname/{vendorname}")
	public Vendor findByVendorname(@PathVariable String vendorname) {
		return vendorService.findByVendorname(vendorname);
	}
}
