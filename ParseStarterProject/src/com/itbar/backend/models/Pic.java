package com.itbar.backend.models;

/**
 * Pic representa a una foto de un Item del Menu
 *
 * @author martin
 */

public class Pic {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private MenuItem menuItem;

	private String src = null;


	/**
	 * Instantiates a new Pic.
	 *
	 * @param src the src
	 */
	public Pic(String src) {
		this.src = src;
	}
	
	/* Getters & Setters */
	
	/* Getters */

	/**
	 * Gets id.
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets menu item.
	 *
	 * @return menu item
	 */
	public MenuItem getMenuItem() {
		return menuItem;
	}

	/**
	 * Sets menu item.
	 *
	 * @param item the item
	 */
	public void setMenuItem(MenuItem item) {
		this.menuItem = item;
	}
	
	/* Setters */

	/**
	 * Gets src.
	 *
	 * @return the src
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * Sets src.
	 *
	 * @param src the src
	 */
	public void setSrc(String src) {
		this.src = src;
	}
}
