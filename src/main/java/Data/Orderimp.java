package data;

import java.util.ArrayList;
import java.util.List;

import model.Order;

public class Orderimp implements Dorder{
	
	// 	public Order(int id, int customer, String status) {
	public static List<Order>orderlist=new ArrayList<>();

	@Override
	public List<Order> findAll() {
		return orderlist;
	}

	@Override
	public Order findById(int id) {
		for (Order order : orderlist) {  
            if(order.getId() == id){
                return order;
            }
        }
        return null;
	}

	@Override
	public Order save(Order order) {
		orderlist.add(order);
        return order;
	}

	@Override
	public Order update(int id, Order req_order) {
		for (Order cart : orderlist) {  
            if(cart.getId() == id){
            	int index = orderlist.indexOf(cart);
            	orderlist.set(index, req_order);
                return req_order;
            }
        }
		return null;
	}

	@Override
	public Order delete(int id) {
		Order deleted_order = orderlist.remove(id - 1);
		return deleted_order;
	}

}
