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

import cdacproject.cdacproject.controller.response.GlobalResponse;
import cdacproject.cdacproject.entity.Order;
import cdacproject.cdacproject.service.OrderService;

@RestController
@CrossOrigin(origins = "*")

public class OrderController {
@Autowired
	
	private OrderService orderService;
	
	@GetMapping("/orders")
	public  List<Order> getOrders() {
		return orderService.getOrders();
	}
	
	@GetMapping("/orders/{orderId}")
	public Order getOrder(@PathVariable String orderId) {
		return orderService.getOrder(Long.parseLong(orderId));
	}
	
	@PostMapping("/orders")
	public GlobalResponse addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}
	
	@PutMapping("/orders")
	public GlobalResponse updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}
	
	@DeleteMapping("/orders/{orderId}")
	public GlobalResponse deleteOrder(@PathVariable String orderId) {
		return orderService.deleteOrder(Long.parseLong(orderId));
	}
	
	@GetMapping("/orders/username/{username}")
	public List<Order> findByUsername(@PathVariable String username) {
		return orderService.findByUsername(username);
	}
	
	@GetMapping("/orders/vendorname/{vendorname}")
	public List<Order> findByVendorname(@PathVariable String vendorname) {
		return orderService.findByVendorname(vendorname);
	}
}
