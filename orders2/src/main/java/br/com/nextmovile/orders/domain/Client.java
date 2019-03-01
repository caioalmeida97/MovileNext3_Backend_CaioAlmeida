package br.com.nextmovile.orders.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
	
//	private String id;
	private String email;
	private String name;
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
	
	@NotEmpty(message = "Client name must not be null")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@NotEmpty(message = "Client email must not be null")
	@Email(message = "Invalid email")
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
