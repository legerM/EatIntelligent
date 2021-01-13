package model;

import java.util.List;

public class Order {
	
	private int id;
	private int customer;
	private String status;
	private List<Cart> carts;

	public Order() {
		
	}
	
	public Order(int id, int customer, String status) {
		super();
		this.id = id;
		this.customer = customer;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", status=" + status + ", carts=" + carts + "]";
	}	

}
