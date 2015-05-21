package com.itbar.backend.util.types;

import com.itbar.backend.util.Formattable;

/**
 * Created by martin on 20/05/15.
 */
public class Email implements Formattable {
	String email;

	public Email(String email) {
		this.email = email;
	}

	public static Boolean validateFormat(String email) {
		return true;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean validateFormat() {
		return validateFormat(email);
	}

	@Override
	public String toString() {
		return this.getEmail();
	}
}
