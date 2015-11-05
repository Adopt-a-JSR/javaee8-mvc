package io.eddumelendez.mvc;

public class PersonView {

	private String value;

	public PersonView(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}

}
