package com.itbar.backend.util.types;

import com.itbar.backend.util.Formats;
import com.itbar.backend.util.Formattable;

/**
 * Created by martin on 20/05/15.
 */
public class Phone implements Formattable {
	/**
	 * The Phone.
	 */
	String phone;

	/**
	 * Instantiates a new Phone.
	 *
	 * @param phone the phone
	 */
	public Phone(String phone) {
		this.phone = phone;
	}

	/**
	 * Validate format.
	 *
	 * @param phone the phone
	 * @return the boolean
	 */
	public static Boolean validateFormat(String phone) {
		return Formats.PHONE.matcher(phone).matches();
	}

	/**
	 * Gets phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets phone.
	 *
	 * @param phone the phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean validateFormat() {
		return validateFormat(phone);
	}

	@Override
	public String toString() {
		return this.getPhone();
	}
}
