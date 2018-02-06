package test;

import controller.ProductController;

public class App {

	public static void main(String[] args) {
		ProductController.writeOutProducts(ProductController.getAllProductInList());
	}
}
