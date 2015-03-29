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


import lombok.Builder;
import lombok.Data;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Simple address object. It is optional in {@link User} object but if it is
 * given we want to have a complete information set.
 * <p>
 * Getters/Setters/Builder is provided by Lombok.
 * </p>
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Data
@Builder
public class Address {

	/**
	 * Street information, is required.
	 */
	@NotBlank(message = AddressErrorMessages.NO_STREET)
	private String street;

	/**
	 * House number information, is required.
	 */
	@NotBlank(message = AddressErrorMessages.NO_HOUSENUMBER)
	private String housenumber;

	/**
	 * ZIP code information, is required.
	 */
	@NotBlank(message = AddressErrorMessages.NO_ZIP_CODE)
	private String zip;

	/**
	 * City information, is required.
	 */
	@NotBlank(message = AddressErrorMessages.NO_CITY)
	private String city;

	/**
	 * Country information is required.
	 */
	@NotBlank(message = AddressErrorMessages.NO_COUNTRY)
	private String country;

}
