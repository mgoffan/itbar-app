package com.itbar.backend.util;

/**
 * Created by martin on 20/05/15.
 */
public interface Formattable {

	/**
	 * Validate format.
	 *
	 * @return the boolean
	 * @deprecated Usar isValid
	 */
	public Boolean validateFormat();

	/**
	 * Is Valid
	 *
	 * @return true/false dependiendo del formato
	 */
	public Boolean isValid();

}
