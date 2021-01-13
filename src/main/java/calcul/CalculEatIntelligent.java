/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;

import calcul.classes.Cart;
import calcul.classes.Product;
import java.util.ArrayList;

/**
 *
 * @author Mickael_L
 */
public class CalculEatIntelligent {

    public ArrayList<Product> productsList;

    public CalculEatIntelligent() {

    }

    public void set_Cart() {
        ArrayList productListCopy = productsList;
        ArrayList productListVegetarian = bdd.getProductByCategory("vegetarian");
        ArrayList productListVegan = bdd.getProductByCategory("vegan");
        ArrayList productListGourmand = bdd.getProductByCategory("gourmand");
        int sizeOfProductList = productsList.size();

        while (sizeOfProductList > 0) {
            Cart lastChanceCart = new Cart("LastChance", "solo", Constantes.ConstantesIdentifiants.PRICE_OF_SOLO);
            Cart vegetarianCart = new Cart("Végétarian", "solo", Constantes.ConstantesIdentifiants.PRICE_OF_SOLO);
            Cart veganCart = new Cart("Vegan", "solo", Constantes.ConstantesIdentifiants.PRICE_OF_SOLO);
            Cart gourmandCart = new Cart("Gourmand", "solo", Constantes.ConstantesIdentifiants.PRICE_OF_SOLO);
            for (Product product : productsList) {
                Product productToGive;
                if (product.getCategory().equals("LP") || product.getCategory().equals("FP")) {
                    if (product.getQuantity() > 3) {
                        productToGive = new Product();
                        int productNumber = product.getQuantity();
                        int productNewNumber = productNumber - 3;
                        product.setQuantity(productNewNumber);
                    }
                }
                if (!product.getCategory().equals("viande") && !product.getCategory().equals("poisson")) {
                    if (!product.getCategory().equals("Laitages,fromages,desserts") && !product.getCategory().equals("Oeufs") && product.getCategory().equals("Lait")) {
                        veganCart.AddProductToList(productToGive);
                    } else {
                        vegetarianCart.AddProductToList(product);
                    }
                }

            }

        }
    }

    public Cart createVegetarianCart(ArrayList<Product> productsList) {
        Cart vegetarianCart = new Cart("Végétarian", "solo", Constantes.ConstantesIdentifiants.PRICE_OF_SOLO);
        Product productToGive;
        int cartPrice = 0;
        while (cartPrice < Constantes.ConstantesIdentifiants.PRICE_OF_SOLO) {
            for (Product product : productsList) {
                if (!product.getCategory().equals("viande") && !product.getCategory().equals("poisson")) {
                    if (product.getQuantity() > 1) {
                        
                        productToGive = new Product();
                        int productNumber = product.getQuantity();
                        int productNewNumber = productNumber - 1;
                        product.setQuantity(productNewNumber);
                    }

                }
            }
        }
        return vegetarianCart;
    }

}
