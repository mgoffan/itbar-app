package com.itbar.backend;

import com.itbar.backend.models.User;
import com.itbar.backend.util.Form;

/**
 * Singleton
 * <p/>
 * Created by martin on 20/05/15.
 */
public class BackEnd {

	private static BackEnd instance = null;

	private BackEnd() {
		/* init backend */
	}

	public BackEnd getInstance() {
		if (this.instance == null) {
			instance = new BackEnd();
		}

		return instance;
	}

	public User createUser(Form form) {

		if (form.validateFormat()) {

			User user = new User(form);

			// Traduce al save de Parse
			// User solo debe contener la info de User
			// Voy a tener que pedir a Parse y reconstruir el User
//			return UserController.save(user);
//			return user.save();
			return null;
		}

		return null;

	}

	public User logginUser(Form form) {

		if (form.validateFormat()) {


//			return User.get(form);
		}

		return null;

	}
}
