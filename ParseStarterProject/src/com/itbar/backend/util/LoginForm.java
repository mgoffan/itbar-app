package com.itbar.backend.util;

/**
 * Created by martin on 20/05/15.
 */
public class LoginForm extends BasicForm {

	private String legajo;
	private String password;

	public LoginForm(String legajo, String password) {
		this.legajo = legajo;
		this.password = password;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String username) {
		this.legajo = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Boolean validateFormat() {
		return;
	}
}
