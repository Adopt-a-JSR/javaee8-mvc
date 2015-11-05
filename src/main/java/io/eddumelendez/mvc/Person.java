package io.eddumelendez.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class Person {

	@FormParam("name")
	@NotNull(message = "{person.name.notnull}")
	@Size(min = 1, max = 20, message = "{person.name.size}")
	private String name;

	@FormParam("lastname")
	@NotNull(message = "{person.lastname.notnull}")
	@Size(min = 1, max = 20, message = "{person.lastname.size}")
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
