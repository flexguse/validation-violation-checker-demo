/**
 * 
 */
package de.flexguse.util.junit.demo.model;

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
