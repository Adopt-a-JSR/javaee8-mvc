package io.eddumelendez.mvc;

import javax.inject.Named;
import javax.mvc.annotation.RedirectScoped;
import java.io.Serializable;

@Named("messageBean")
@RedirectScoped
public class MessageBean implements Serializable {

	private String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
