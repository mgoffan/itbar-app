package com.itbar.backend.util;

import com.itbar.backend.util.types.Email;
import com.itbar.backend.util.types.Legajo;
import com.itbar.backend.util.types.Phone;

/**
 * Created by martin on 21/05/15.
 */
public class FormBuilder {

	public static FormBuilder instance = null;

	private FormBuilder() {

	}

	public FormBuilder getInstance() {
		if (instance == null) {
			instance = new FormBuilder();
		}
		return instance;
	}

	public Form buildLoginForm() {
		Form form = new Form();
		form.addField(new Field<Legajo>());
		form.addField(new Field<Password>());
		return form;
	}

	public Form buildSignupForm() {
		Form form = new Form();
		form.addField(new Field<Legajo>());
		form.addField(new Field<Email>());
		form.addField(new Field<Phone>());
		return form;
	}
}
