package com.itbar.backend.controllers;

/**
 * Created by martin on 5/20/15.
 * @param <T>  the type parameter
 */
public interface Controller<T> {

	/**
	 * Save void.
	 *
	 * @param item the item
	 */
	public void save(T item);

	/**
	 * Update void.
	 *
	 * @param item the item
	 */
	public void update(T item);

}
