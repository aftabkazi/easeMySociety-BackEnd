package cdacproject.cdacproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cdacproject.cdacproject.entity.Order;

//import org.springframework.data.jpa.repository.JpaRepository;

//import cdacproject.cdacproject.entity.User;
@Repository
public interface OrderDao extends JpaRepository<Order, Long>{

	List<Order> findByUsername(String username);
	List<Order> findByVendorname(String vendorname);


}
