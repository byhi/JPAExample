package main;

import org.apache.log4j.Logger;
import controller.ProductController;

public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {

		try {
			ProductController.writeListToConsole(ProductController.getEmptyProductions());
			ProductController.writeListToConsole(ProductController.getAllProductInList());
			ProductController.createProduct("Kacs6aHús", "10050", "150", "Kjaja");
		} catch (NullPointerException e) {
			logger.error("This is error:", e);
		}
		
	}
}
