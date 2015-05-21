package com.itbar.backend.util;

/**
 * Created by martin on 20/05/15.
 * @param <T>  the type parameter
 */
public class Field<T extends Formattable> implements Formattable {

	private T elem;

	/**
	 * Instantiates a new Field.
	 */
	public Field() {
	}

	/**
	 * Instantiates a new Field.
	 *
	 * @param elem the elem
	 */
	public Field(T elem) {
		this.elem = elem;
	}

	/**
	 * Gets elem.
	 *
	 * @return the elem
	 */
	public T getElem() {
		return elem;
	}

	/**
	 * Sets elem.
	 *
	 * @param elem the elem
	 */
	public void setElem(T elem) {
		this.elem = elem;
	}

	@Override
	public Boolean validateFormat() {
		return elem.validateFormat();
	}
}
