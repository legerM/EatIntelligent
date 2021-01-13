package Eatelligent.model;

public class Product {
	private int id;
	private String name;
	private String category;
	private String date;
	private int quantity;
	private int price;
	private int provider;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String category, String date, int quantity, int price, int provider) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.date = date;
		this.quantity = quantity;
		this.price = price;
		this.provider = provider;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getProvider() {
		return provider;
	}

	public void setProvider(int provider) {
		this.provider = provider;
	}

}
