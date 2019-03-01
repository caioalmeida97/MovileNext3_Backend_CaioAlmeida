package br.com.nextmovile.orders.domain;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	
	@Id
	private String id;
	private Client client; 
	private List<Product> productList;
	
	public Order(String id, Client client, List<Product> productList) {
		this.id = id;
		this.client = client;
		this.productList = productList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	@NotEmpty(message = "Client can't be null")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@NotEmpty(message = "Product list must have at least one product")
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
