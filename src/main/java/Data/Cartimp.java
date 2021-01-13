package data;

import java.util.ArrayList;
import java.util.List;

import model.Cart;

public class Cartimp implements Dcart{
	
	// Cart(int id, String type, int price, List<Product> products) {

	public static List<Cart>cartlist=new ArrayList<>();

	@Override
	public List<Cart> findAll() {
		return cartlist;
	}

	@Override
	public Cart findById(int id) {
		for (Cart cart : cartlist) {  
            if(cart.getId() == id){
                return cart;
            }
        }
        return null;
	}

	@Override
	public Cart save(Cart cart) {
		cartlist.add(cart);
        return cart;
	}

	@Override
	public Cart update(int id, Cart req_cart) {
		for (Cart cart : cartlist) {  
            if(cart.getId() == id){
            	int index = cartlist.indexOf(cart);
            	cartlist.set(index, req_cart);
                return req_cart;
            }
        }
		return null;
	}

	@Override
	public Cart delete(int id) {
		Cart deleted_cart = cartlist.remove(id - 1);
		return deleted_cart;
	}
	
	

}
