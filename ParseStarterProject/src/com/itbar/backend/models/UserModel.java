package com.itbar.backend.models;

import com.itbar.backend.util.types.Email;
import com.itbar.backend.util.types.Phone;
import com.parse.ParseUser;

/**
 * El que va a hablar con Parse?
 */
public class UserModel extends ParseUser {

	private String legajo;

	private String name;
	private String surname;

	private Email email;

	private Phone phone;

}
