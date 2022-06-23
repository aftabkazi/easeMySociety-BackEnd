package cdacproject.cdacproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdacproject.cdacproject.controller.response.GlobalResponse;
import cdacproject.cdacproject.dao.OrderDao;
import cdacproject.cdacproject.entity.Order;

@Service
public class OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public List<Order> getOrders() {
		return orderDao.findAll();
	}
	
	public Order getOrder(Long id) {
		return orderDao.getById(id);
	}
	
	public GlobalResponse addOrder(Order order) {
		Order entity = orderDao.save(order);
		return new GlobalResponse(entity.getId(), "Order Added Successful", true);
	}
	
	public GlobalResponse updateOrder(Order order) {
		Order entity = orderDao.save(order);
		return new GlobalResponse(entity.getId(), "Order Updated Successful", true);
	}
	
	public GlobalResponse deleteOrder(Long id) {
		Order entity = orderDao.getById(id);
		orderDao.delete(entity);
		return new GlobalResponse(id, "Order Deleted Successful", true);
	}
	
	public List<Order> findByUsername(String username) {
//		Order entity = orderDao.findByOrdername(ordername);
		return orderDao.findByUsername(username);
	}
	
	public List<Order> findByVendorname(String vendorname) {
//		Order entity = orderDao.findByOrdername(ordername);
		return orderDao.findByVendorname(vendorname);
	}
}
