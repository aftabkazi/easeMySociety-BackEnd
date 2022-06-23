package cdacproject.cdacproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String vendorname;
	private String status = "Requested";
	private String mobile;
	private String address;
	private String vendorMobile;
	private String vendorOccupation;
	private String vendorAddress;
	public Order() {
		super();
	}
	public Order(Long id, String username, String vendorname, String status, String mobile, String address,
			String vendorMobile, String vendorOccupation, String vendorAddress) {
		super();
		this.id = id;
		this.username = username;
		this.vendorname = vendorname;
		this.status = status;
		this.mobile = mobile;
		this.address = address;
		this.vendorMobile = vendorMobile;
		this.vendorOccupation = vendorOccupation;
		this.vendorAddress = vendorAddress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVendorMobile() {
		return vendorMobile;
	}
	public void setVendorMobile(String vendorMobile) {
		this.vendorMobile = vendorMobile;
	}
	public String getVendorOccupation() {
		return vendorOccupation;
	}
	public void setVendorOccupation(String vendorOccupation) {
		this.vendorOccupation = vendorOccupation;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	
}
