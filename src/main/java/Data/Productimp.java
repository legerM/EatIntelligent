package Eatelligent.data;

import java.util.ArrayList;
import java.util.List;

import Eatelligent.model.Product;

public class Productimp implements Dproduct {
	
	//Product(int id, String name, String category, String date, int quantity, int price, String provider) {
	public static List<Product>productlist=new ArrayList<>();
	static {
		productlist.add(new Product(1, "carotte", "légume petit", "13/01/20", 20, 1, 1));
		productlist.add(new Product(2, "carotte", "légume petit", "13/01/20", 30, 1, 2)); 
		productlist.add(new Product(3, "baguette", "pain", "13/01/20", 10, 1, 3));
	}
	
	public List<Product>findAll() {
		return productlist;
	}

	public Product findById(int id) {
		for (Product product : productlist) {  
            if(product.getId() == id){
                return product;
            }
        }
        return null;
	}

	public Product save(Product product) {
		productlist.add(product);
        return product;
	}

	public Product update(int id, Product req_product) {
		for (Product product : productlist) {  
            if(product.getId() == id){
            	int index = productlist.indexOf(product);
            	productlist.set(index, req_product);
                return req_product;
            }
        }
		return null;
	}

	public Product delete(int id) {
		Product deleted_product = productlist.remove(id - 1);
		return deleted_product;
	}
	
	public List<Product>getProductsByCategory(String category) {
		List<Product>resultlist = new ArrayList<>();
		for (Product product : productlist) {  
            if(product.getCategory() == category){
                resultlist.add(product);
            }
        }
		return resultlist;
	}

}
