package controller;


import java.util.List;
import model.Product;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//Product p = new Product("Cigi","1100","1012","Cigi") ;
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("Product");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();*/
	}
}
