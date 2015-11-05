package io.eddumelendez.mvc;

import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("csrf")
@Controller
public class CsrfController {

	@GET
	public String form() {
		return "csrf.jsp";
	}

	@POST
	@CsrfValid
	public String proccess(@FormParam("name") String name) {
		return "redirect:/csrf";
	}

}
