package controller;


import java.util.List;
import model.Product;

public class App {

	public static void main(String[] args) {
		List<Product> valami = ProductController.getAllProductInList();
		for (Product product : valami) {
			System.out.println(product.toString());
		}
	}

	public static void saveProducts(Product p) {
		List<Product> valami = ProductController.getAllProductInList();
		for (Product product : valami) {
			System.out.println(product.toString());
		}
	}
}
