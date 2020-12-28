package org.hcl.shoppingcart;
import java.util.List;
public class ShoppingCart {
	public List<Product>products;
	public List<Product> getProducts() {
		return products;
	}
public ShoppingCart() {
	// TODO Auto-generated constructor stub
}
public ShoppingCart(List<Product> products) {
	super();
	this.products = products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}


}
