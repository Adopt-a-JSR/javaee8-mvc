package io.eddumelendez.mvc;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("app")
public class MvcApplication extends ResourceConfig {

	public MvcApplication() {
		packages("io.eddumelendez.mvc");
	}

}
