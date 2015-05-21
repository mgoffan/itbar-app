package com.itbar.backend.util.types;

import com.itbar.backend.util.Field;
import com.itbar.backend.util.Formats;

/**
 * Created by martin on 20/05/15.
 */
public class Legajo extends Field {

	private String legajo;

	public Legajo(String legajo) {
		this.legajo = legajo;
	}

	public static Boolean validateFormat(String legajo) {
		return Formats.LEGAJO.matcher(legajo).matches();
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return legajo;
	}

	@Override
	public Boolean validateFormat() {
		return validateFormat(this.legajo);
	}
}
