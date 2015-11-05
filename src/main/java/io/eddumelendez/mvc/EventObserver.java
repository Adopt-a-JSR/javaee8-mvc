package io.eddumelendez.mvc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.mvc.event.AfterControllerEvent;
import javax.mvc.event.AfterProcessViewEvent;
import javax.mvc.event.BeforeControllerEvent;
import javax.mvc.event.BeforeProcessViewEvent;
import javax.mvc.event.ControllerRedirectEvent;

@ApplicationScoped
public class EventObserver {

	public void onBeforeControllerEvent(@Observes BeforeControllerEvent event) {
		System.out.println("BeforeControllerEvent " + event.getUriInfo().getRequestUri());
	}

	public void onAfterControllerEvent(@Observes AfterControllerEvent event) {
		System.out.println("AfterControllerEvent " + event.getResourceInfo().getResourceMethod());
	}

	public void onBeforeProcessViewEvent(@Observes BeforeProcessViewEvent event) {
		System.out.println("BeforeProcessViewEvent " + event.getView());
	}

	public void onAfterProcessViewEvent(@Observes AfterProcessViewEvent event) {
		System.out.println("AfterProcessViewEvent " + event.getView());
	}

	public void onControllerRedirectEvent(@Observes ControllerRedirectEvent event) {
		System.out.println("ControllerRedirectEvent " + event.getLocation().toString());
	}

}
