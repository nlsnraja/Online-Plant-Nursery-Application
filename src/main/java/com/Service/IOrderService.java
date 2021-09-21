package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Order;

public interface IOrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public Order deleteOrder(int orderId);
	public Order viewOrder(int orderId);
	public List<Order> viewAllOrders();

}
