package model;

import java.util.List;

public class Cart {
	
	private int id;
	private String type;
	private int price;
	private List<Product> products;
	
	public Cart() {
	}
	
	public Cart(int id, String type, int price) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProductToList(Product product) {
		products.add(product);
	}

}
