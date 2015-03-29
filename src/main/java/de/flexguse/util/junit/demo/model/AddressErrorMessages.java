/**
 * 
 */
package de.flexguse.util.junit.demo.model;

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
