package com.itbar.backend.util;

import com.itbar.backend.util.types.Email;
import com.itbar.backend.util.types.Legajo;
import com.itbar.backend.util.types.Password;
import com.itbar.backend.util.types.Phone;

/**
 * Created by martin on 21/05/15.
 */
public class FormBuilder {

	/**
	 * Build login form.
	 *
	 * @return the form
	 */
	public static Form buildLoginForm() {
		Form form = new Form();
		form.addField(new Field<Legajo>());
		form.addField(new Field<Password>());
		return form;
	}

	/**
	 * Build signup form.
	 *
	 * @return the form
	 */
	public static Form buildSignupForm() {
		Form form = new Form();
		form.addField(new Field<Legajo>());
		form.addField(new Field<Email>());
		form.addField(new Field<Phone>());
		return form;
	}
}
