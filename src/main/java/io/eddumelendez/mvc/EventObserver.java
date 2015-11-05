package io.eddumelendez.mvc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.mvc.event.ControllerMatched;
import javax.mvc.event.ViewEngineSelected;

@ApplicationScoped
public class EventObserver {

	public void onViewEngineSelected(@Observes ViewEngineSelected event) {
		System.out.println(event.toString());
	}

	public void onControllerMatched(@Observes ControllerMatched event) {
		System.out.println(event.toString());
	}

}
