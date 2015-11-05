package io.eddumelendez.mvc;

import org.glassfish.jersey.server.ResourceConfig;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("app")
public class MvcApplication extends ResourceConfig {

	public MvcApplication() {
		packages("io.eddumelendez.mvc");

		Map<String, Object> properties = new HashMap<>();
		properties.put("mvcVersion", "EDR2");
		properties.put(Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.EXPLICIT);
		setProperties(properties);
	}

}
