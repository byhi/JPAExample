package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="product", schema="testuser")
@NamedQuery(name="Product.findAll", query="SELECT e FROM Product e")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id ;
	
	private String Name ;
	private String Cost ;
	private String Quantity ;
	private String Type ;
	public Product(String name, String cost, String quantity, String type) {
		super();
		Name = name;
		Cost = cost;
		Quantity = quantity;
		Type = type;
	}
	
	
	public Product() {
		super();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Cost=" + Cost + ", Quantity=" + Quantity + ", Type=" + Type
				+ "]";
	}
	
}
