package io.eddumelendez.mvc;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@Path("book")
public class PersonController {

	@Inject
	private Models models;

	@Inject
	private MessageBean messageBean;

	@Inject
	private BindingResult bindingResult;

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
	public PersonView newPerson() {
		return new PersonView("person.jsp");
	}

	@POST
	@Path("add")
	@ValidateOnExecution(type = ExecutableType.NONE)
	public String add(@Valid @BeanParam Person person) {
		if (this.bindingResult.isFailed()) {
			List<String> errorMessages = this.bindingResult.getAllMessages();
			this.models.put("errors", errorMessages);
			return "person.jsp";
		}

		people.add(person);
		this.messageBean.setValue("Person has been added.");
		return "redirect:book/list";
	}

	@GET
	@Path("delete")
	public String delete(@QueryParam("personId") int personId) {
		people.remove(personId);
		this.messageBean.setValue("Person has been deleted.");
		return "redirect:book/list";
	}

}
