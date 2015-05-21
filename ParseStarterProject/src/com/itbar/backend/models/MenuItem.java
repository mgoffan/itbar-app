package com.itbar.backend.models;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;
	private String description;

	private List<Pic> pics = new ArrayList<Pic>();


	public MenuItem(String name, String desc) {
		this.name = name;
		this.description = desc;
	}

	public MenuItem(String name, String desc, Pic pic) {
		this.name = name;
		this.description = desc;
		this.pics.add(pic);
	}
	
	/*
	 * Getters & Setters
	 */
	
	
	/* Getters */

	/**
	 * Obtener el id del Item del Menu
	 *
	 * @return Long id del item
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Obtener el nombre del Item del Menu
	 *
	 * @return String nombre del item
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Settear el nombre del Item del Menu
	 *
	 * @param name nombre para el item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtener la descripcion del Item del Menu
	 *
	 * @return String la descripcion del producto
	 */
	public String getDescription() {
		return description;
	}
	
	/* Setters */

	/**
	 * Settear la descripcion del Item del Menu
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public List<Pic> getPics() {
		return pics;
	}

	public void setPics(List<Pic> pics) {
		this.pics = pics;
	}

	public void addPic(Pic pic) {
		this.pics.add(pic);
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
}