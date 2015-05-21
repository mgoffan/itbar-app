package com.itbar.backend;

import com.itbar.backend.controllers.UserController;
import com.itbar.backend.util.Form;
import com.itbar.backend.views.User;

/**
 * Clase estatica que expone todo el comportamiento del Back End
 *
 *
 *
 * <p/>
 * Created by martin on 20/05/15.
 */
public class BackEnd {

	private static BackEnd instance = null;
	private UserController userController = null;

	private BackEnd() {
		userController = new UserController();
	}

	public BackEnd use() {
		if (instance == null) {
			instance = new BackEnd();
		}
		return instance;
	}


	/**
	 * Create user.
	 *
	 * @param form the form
	 * @return the user
	 */
	public User createUser(Form form) {

		if (form.isValid()) {

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

	/**
	 * Login user.
	 *
	 * @param form the form
	 * @return the user
	 */
	public User loginUser(Form form) {

		if (userController.userHasLoggedIn()) {
			userController.logoutUser();
		}

		if (form.isValid()) {

			return userController.loginUser(form);


//			return User.get(form);
		}

		return null;

	}


	/* App Lifecycle */

	public void lowMemory() {

	}

	public void terminate() {

	}

	public void trimMemory() {

	}

}
