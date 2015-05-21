package com.itbar.backend.util;

/**
 * Created by martin on 20/05/15.
 */
public class Field<T extends Formattable> implements Formattable {

	private T elem;

	public Field() {
	}

	public Field(T elem) {
		this.elem = elem;
	}

	public T getElem() {
		return elem;
	}

	public void setElem(T elem) {
		this.elem = elem;
	}

	@Override
	public Boolean validateFormat() {
		return elem.validateFormat();
	}
}
