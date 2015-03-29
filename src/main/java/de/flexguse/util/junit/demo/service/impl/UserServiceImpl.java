/**
 * 
 */
package de.flexguse.util.junit.demo.service.impl;

import de.flexguse.util.junit.demo.model.User;
import de.flexguse.util.junit.demo.service.UserService;

/**
 * This implementation of {@link UserService} does nothing. It is just a stub to
 * demonstrate how the JSR303 bean validation works for method calls.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
public class UserServiceImpl implements UserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.flexguse.util.junit.demo.service.UserService#saveUser(de.flexguse.
	 * util.junit.demo.model.User)
	 */
	@Override
	public void saveUser(User user) {
		// nothing to do here

	}

}
