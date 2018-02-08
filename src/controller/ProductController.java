package controller;

import java.io.File;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.eclipse.persistence.exceptions.DatabaseException;
import model.Product;
import poperties.ProperiesManager;


public class ProductController {
	final static Logger logger = Logger.getLogger(ProductController.class);

	@SuppressWarnings("unchecked")
	public static List<model.Product> getAllProductInList() {
		EntityManagerFactory emf;
		List<model.Product> list = null;
		try {
			emf = Persistence.createEntityManagerFactory("Product");
			EntityManager em = emf.createEntityManager();

			list = em.createNamedQuery("Product.findAll").getResultList();
			em.close();
		} catch (DatabaseException | PersistenceException e) {
			logger.error("This is error : ", e);
		}
		return list;

	}

	@SuppressWarnings("unchecked")
	public static List<Product> getEmptyProductions() {
		EntityManagerFactory emf;
		List<Product> result = null;
		try {
			Properties props = ProperiesManager.getPropertiesFromFile(new File("src/sql.properties"));
			emf = Persistence.createEntityManagerFactory("Product");
			EntityManager em = emf.createEntityManager();

			Query query = em.createQuery(props.getProperty("emptyproductions"));
			// "Select e.firstName FROM Employee e");

			result = (List<Product>) query.getResultList();
			em.close();

		} catch (Exception e) {
			logger.error("This is error : ", e);
		}
		// Query for a List of data elements.
		return result;

	}

	public static void createProduct(String name, String cost, String quantity, String type) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Product");
		try {

			EntityManager em = emf.createEntityManager();
			model.Product product = new model.Product(name, cost, quantity, type);
			em.persist(product);
			em.close();
		} catch (DatabaseException | PersistenceException e) {
			logger.error("This is error : ", e);
		}
	}

	public static void writeListToConsole(List<Product> list) throws NullPointerException {
		if (list != null) {
			for (Product product : list) {
				System.out.println(product.toString());
			}
		} else {
			throw new NullPointerException();
		}

	}

	public static void writeOutProducts(List<Product> allProductInList) {
		// TODO Auto-generated method stub
		
	}

}
