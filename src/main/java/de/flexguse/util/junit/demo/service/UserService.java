/**
 * 
 */
package de.flexguse.util.junit.demo.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import de.flexguse.util.junit.demo.model.User;

/**
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Validated
public interface UserService {

	public void saveUser(@Valid User user);
	
}
