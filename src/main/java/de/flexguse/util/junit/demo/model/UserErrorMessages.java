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
