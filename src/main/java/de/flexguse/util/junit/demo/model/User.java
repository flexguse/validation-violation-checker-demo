/**
 * 
 */
package de.flexguse.util.junit.demo.model;

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
