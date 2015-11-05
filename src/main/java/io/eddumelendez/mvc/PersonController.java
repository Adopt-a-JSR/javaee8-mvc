package io.eddumelendez.mvc;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.Viewable;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Controller
@Path("book")
public class PersonController {

	@Inject
	private Models models;

	private static List<Person> people;

	static {
		people = new ArrayList<>();
	}

	@GET
	@Path("list")
	@View("personList.jsp")
	public void list() {
		this.models.put("people", people);
	}

	@GET
	@Path("new")
	public String newPerson() {
		return "person.jsp";
	}

	@POST
	@Path("add")
	public Viewable add(@BeanParam Person person) {
		people.add(person);
		this.models.put("people", people);
		return new Viewable("personList.jsp");
	}

	@GET
	@Path("delete")
	public Response delete(@QueryParam("personId") int personId) {
		people.remove(personId);
		return Response.seeOther(URI.create("book/list")).build();
	}

}
