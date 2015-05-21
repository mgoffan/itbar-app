package com.itbar.backend.util.types;

import com.itbar.backend.util.Formats;
import com.itbar.backend.util.Formattable;

/**
 * Created by martin on 20/05/15.
 */
public class Phone implements Formattable {
	String phone;

	public Phone(String phone) {
		this.phone = phone;
	}

	public static Boolean validateFormat(String phone) {
		return Formats.PHONE.matcher(phone).matches();
	}

	public String getPhone() {
		return phone;
	}

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
