package com.itbar.backend.controllers;

/**
 * Created by martin on 5/20/15.
 */
public interface Controller<T> {

	public void save(T item);

	public void update(T item);

}
