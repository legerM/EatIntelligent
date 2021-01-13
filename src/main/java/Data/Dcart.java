package data;

import java.util.List;

import model.Cart;


public interface Dcart {
	public List<Cart>findAll();
    public Cart findById(int id);
    public Cart save(Cart cart);
	public Cart update(int id, Cart req_cart);
	public Cart delete(int id);
}
