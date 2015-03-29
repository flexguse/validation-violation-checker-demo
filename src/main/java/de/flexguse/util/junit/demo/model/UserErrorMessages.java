/**
 * 
 */
package de.flexguse.util.junit.demo.model;

/**
 * The error messages used for JSR303 bean validation for {@link User} object is
 * stored in this interface to keep the bean as clean as possible.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
public interface UserErrorMessages {

	/**
	 * Error message if no eMail address is given.
	 */
	public static final String NO_EMAIL = "the eMail is required";

	/**
	 * Error message if invalid eMail address is given.
	 */
	public static final String INVALID_EMAIL = "the eMail is invalid";

	/**
	 * Error message if no login is given.
	 */
	public static final String NO_LOGIN = "the login is required";

	/**
	 * Error message if the given login is too short.
	 */
	public static final String TOO_SHORT_LOGIN = "the login must have at least 4 characters";

	/**
	 * Error message if no password is given.
	 */
	public static final String NO_PASSWORD = "the password is required";

	/**
	 * Error message if the given password is too short.
	 */
	public static final String TOO_SHORT_PASSWORD = "the given password is too short and must have at least 8 characters";

}
