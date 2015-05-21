package com.itbar.backend.models;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Menu item.
 */
public class MenuItem {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;
	private String description;

	private List<Pic> pics = new ArrayList<Pic>();


	/**
	 * Instantiates a new Menu item.
	 *
	 * @param name the name
	 * @param desc the desc
	 */
	public MenuItem(String name, String desc) {
		this.name = name;
		this.description = desc;
	}

	/**
	 * Instantiates a new Menu item.
	 *
	 * @param name the name
	 * @param desc the desc
	 * @param pic the pic
	 */
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
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets pics.
	 *
	 * @return the pics
	 */
	public List<Pic> getPics() {
		return pics;
	}

	/**
	 * Sets pics.
	 *
	 * @param pics the pics
	 */
	public void setPics(List<Pic> pics) {
		this.pics = pics;
	}

	/**
	 * Add pic.
	 *
	 * @param pic the pic
	 */
	public void addPic(Pic pic) {
		this.pics.add(pic);
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
}