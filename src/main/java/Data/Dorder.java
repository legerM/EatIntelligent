package data;

import java.util.List;

import model.Order;


public interface Dorder {
	public List<Order>findAll();
    public Order findById(int id);
    public Order save(Order order);
	public Order update(int id, Order req_order);
	public Order delete(int id);
}
