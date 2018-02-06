package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Product;

public class ProductController {

public static  List<model.Product> getAllProductInList() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Product");
	EntityManager em = emf.createEntityManager();
	@SuppressWarnings("unchecked")
	List<model.Product> list = em.createNamedQuery("Product.findAll").getResultList();	
	em.close();
	
	return list;
	
}
public static void writeOutProducts(List<Product> valami) {
	for (Product product : valami) {
		System.out.println(product.toString());
	}
}
}
