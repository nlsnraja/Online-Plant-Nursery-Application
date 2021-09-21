package com.example.demo.entities;

import java.time.LocalDate;

public class Order {
private int bookingOrderid;
private LocalDate orderDate;
private String transactionMode;
private int quantity;
private double totalCost;
private Planters planters;
public int getBookingOrderid() {
	return bookingOrderid;
}
public void setBookingOrderid(int bookingOrderid) {
	this.bookingOrderid = bookingOrderid;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public String getTransactionMode() {
	return transactionMode;
}
public void setTransactionMode(String transactionMode) {
	this.transactionMode = transactionMode;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public Planters getPlanters() {
	return planters;
}
public void setPlanters(Planters planters) {
	this.planters = planters;
}
}
