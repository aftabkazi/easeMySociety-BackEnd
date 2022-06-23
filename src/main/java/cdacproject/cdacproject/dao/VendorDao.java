package cdacproject.cdacproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cdacproject.cdacproject.entity.Vendor;
@Repository
public interface VendorDao extends JpaRepository<Vendor, Long>{
	Vendor findByUsername(String username);
}
