/**
 * 
 */
package de.flexguse.util.junit.demo.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import de.flexguse.util.junit.demo.model.User;

/**
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Validated
public interface UserService {

	/**
	 * Persists the user. The user always is validated when calling this method.
	 * 
	 * @param user
	 *            the user which is to be persisted and validated
	 */
	public void saveUser(@Valid User user);

}
