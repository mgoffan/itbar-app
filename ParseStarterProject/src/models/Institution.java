package models;

import java.util.List;

public class Institution  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String id;
	
	private String name;
	

	private List<Bar> bars;

	public Institution(String name, Bar bar) {
		this.name = name;
		this.bars.add(bar);
	}
	
	public Institution(String name, Long bar) {
		this.name = name;

	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return bars
	 */
	public List<Bar> getBars() {
		return bars;
	}
	
	/**
	 * 
	 * @param bars
	 */
	public void setBars(List<Bar> bars) {
		this.bars = bars;
	}

}
