package com.itbar.backend.models;

import java.util.List;

/**
 * The type Institution.
 */
public class Institution {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	private String id;

	private String name;


	private List<Bar> bars;

	/**
	 * Instantiates a new Institution.
	 *
	 * @param name the name
	 * @param bar  the bar
	 */
	public Institution(String name, Bar bar) {
		this.name = name;
		this.bars.add(bar);
	}

	/**
	 * Instantiates a new Institution.
	 *
	 * @param name the name
	 * @param bar the bar
	 */
	public Institution(String name, Long bar) {
		this.name = name;

	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets bars.
	 *
	 * @return bars bars
	 */
	public List<Bar> getBars() {
		return bars;
	}

	/**
	 * Sets bars.
	 *
	 * @param bars the bars
	 */
	public void setBars(List<Bar> bars) {
		this.bars = bars;
	}

}
