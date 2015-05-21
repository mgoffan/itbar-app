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


	public Pic(String src) {
		this.src = src;
	}
	
	/* Getters & Setters */
	
	/* Getters */

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return
	 */
	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem item) {
		this.menuItem = item;
	}
	
	/* Setters */

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
}
