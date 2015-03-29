/**
 * 
 */
package de.flexguse.util.junit.demo.model;

/*
 * #%L
 * validation-violation-checker-demo
 * %%
 * Copyright (C) 2015 flexguse
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


/**
 * The error messages used for JSR303 bean validation for {@link Address} object is
 * stored in this interface to keep the bean as clean as possible.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
public interface AddressErrorMessages {
	
	/**
	 * Validation error message if no street is given.
	 */
	public static final String NO_STREET = "Street is required";
	
	/**
	 * Validation error message if no housenumber is given.
	 */
	public static final String NO_HOUSENUMBER = "Housenumber is required";
	
	/**
	 * Validation error message if no ZIP code is given.
	 */
	public static final String NO_ZIP_CODE = "ZIP code is required";
	
	/**
	 * Validation error message if no city is given.
	 */
	public static final String NO_CITY = "City is required";
	
	/**
	 * Validation error message if no country is given.
	 */
	public static final String NO_COUNTRY = "Country is required";
	
}
