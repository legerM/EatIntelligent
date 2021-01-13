package Eatelligent.data;

import java.util.List;

import Eatelligent.model.Product;

public interface Dproduct {
	
	public List<Product>findAll();
    public Product findById(int id);
    public Product save(Product product);
	public Product update(int id, Product req_product);
	public Product delete(int id);
	public List<Product>getProductsByCategory(String category);
}
