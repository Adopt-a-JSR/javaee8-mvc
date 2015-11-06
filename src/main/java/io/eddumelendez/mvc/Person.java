package io.eddumelendez.mvc;

import javax.ws.rs.FormParam;

public class Person {

	@FormParam("name")
	private String name;

	@FormParam("lastname")
	private String lastname;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
