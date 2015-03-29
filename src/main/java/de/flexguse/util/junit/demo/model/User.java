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


import javax.validation.Valid;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Simple user object containing some attributes which are JSR303 bean
 * validated.
 * 
 * <p>
 * Getters/Setters/Builders etc. are provided by Lombok.
 * </p>
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Data
@Builder
public class User {

	/**
	 * User firstname, is optional.
	 */
	private String firstName;

	/**
	 * User lastname, is optional.
	 */
	private String lastName;

	/**
	 * User email, mandatory.
	 */
	@Email(message = UserErrorMessages.INVALID_EMAIL)
	@NotBlank(message = UserErrorMessages.NO_EMAIL)
	private String eMail;

	/**
	 * User login, is required and must be at least 4 characters long.
	 */
	@NotBlank(message = UserErrorMessages.NO_LOGIN)
	@Size(min = 4, message = UserErrorMessages.TOO_SHORT_LOGIN)
	private String login;

	/**
	 * User password, is required and must be at least 8 characters long.
	 */
	@NotBlank(message = UserErrorMessages.NO_PASSWORD)
	@Size(min = 8, message=UserErrorMessages.TOO_SHORT_PASSWORD)
	private String password;

	/**
	 * Address is optional but must be valid if given.
	 */
	@Valid
	private Address address;

}
