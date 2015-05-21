package com.itbar.backend.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by martin on 21/05/15.
 */
public class Form implements Formattable {

	private Set<Field> fields = new HashSet<Field>();

	public Form() {
	}

	public Form(Field field) {
		this.fields.add(field);
	}

	public Form(Set<Field> fields) {
		this.fields = fields;
	}

	public Set<Field> getFields() {
		return fields;
	}

	public void addField(Field field) {
		this.fields.add(field);
	}

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
