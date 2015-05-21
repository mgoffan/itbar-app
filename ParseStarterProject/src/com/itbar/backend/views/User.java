package com.itbar.backend.views;

import com.itbar.backend.util.types.Email;
import com.itbar.backend.util.types.Legajo;
import com.itbar.backend.util.types.Phone;
import com.itbar.backend.util.types.ProperNoun;

/**
 * Exhibe el comportamiento de un usuario, sin mostrar todo el comportamiento de un ParseUser
 * <p/>
 * Es una clase read-only solo muestra la informacion contenida en el usuario
 * <p/>
 * Para modificar un User se lo debe pedir al Back End
 * <p/>
 * <code>
 * <p/>
 * Backend.getInstance().loginUser(Form);
 * <p/>
 * </code>
 * <p/>
 * Created by martin on 5/21/15.
 */
public class User {

	private Legajo legajo;
	private Email email;
	private ProperNoun name;
	private ProperNoun surname;
	private Phone phone;

	/**
	 * Gets legajo.
	 *
	 * @return the legajo
	 */
	public Legajo getLegajo() {
		return legajo;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public ProperNoun getName() {
		return name;
	}

	/**
	 * Gets surname.
	 *
	 * @return the surname
	 */
	public ProperNoun getSurname() {
		return surname;
	}

	/**
	 * Gets phone.
	 *
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}
}
