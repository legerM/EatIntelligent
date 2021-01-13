package model;

import java.util.List;

public class Provider extends User{

	private List<Product> products;
	private List<Product> history;
	

	public Provider() {
		super();
	}
	
	public Provider(int id, String firstName, String lastName, String phoneNumber, String email, String adress,
			String bankingDetails) {
		super(id, firstName, lastName, phoneNumber, email, adress, bankingDetails);
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getHistory() {
		return history;
	}

	public void setHistory(List<Product> history) {
		this.history = history;
	}
	
}
