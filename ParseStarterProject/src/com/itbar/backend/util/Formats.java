package com.itbar.backend.util;

import java.util.regex.Pattern;

/**
 * Created by martin on 20/05/15.
 */
public interface Formats {

	public static Pattern EMAIL = Pattern.compile("[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}");
	public static Pattern PHONE = Pattern.compile("");
	public static Pattern LEGAJO = Pattern.compile("\\d.+");
}
