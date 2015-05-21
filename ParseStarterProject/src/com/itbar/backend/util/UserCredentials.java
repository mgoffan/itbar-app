package com.itbar.backend.util;

import com.itbar.backend.util.types.Email;

/**
 * Created by martin on 20/05/15.
 */
public class UserCredentials {
	private String username;
	private String password;
	private Email email;

	public UserCredentaials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public UserCredentials(Email email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
}
