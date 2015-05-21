package com.itbar.backend.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by martin on 21/05/15.
 */
public class Form implements Formattable {

	private Set<Field> fields = new HashSet<Field>();

	/**
	 * Instantiates a new Form.
	 */
	public Form() {
	}

	/**
	 * Instantiates a new Form.
	 *
	 * @param field the field
	 */
	public Form(Field field) {
		this.fields.add(field);
	}

	/**
	 * Instantiates a new Form.
	 *
	 * @param fields the fields
	 */
	public Form(Set<Field> fields) {
		this.fields = fields;
	}

	/**
	 * Gets fields.
	 *
	 * @return the fields
	 */
	public Set<Field> getFields() {
		return fields;
	}

	/**
	 * Add field.
	 *
	 * @param field the field
	 */
	public void addField(Field field) {
		this.fields.add(field);
	}

	/**
	 * Add fields.
	 *
	 * @param collection the collection
	 */
	public void addFields(Collection<? extends Field> collection) {
		this.fields.addAll(collection);
	}

	@Override
	public Boolean validateFormat() {
		for (Field field : this.getFields()) {
			if (!field.validateFormat())
				return false;
		}
		return true;
	}
}
