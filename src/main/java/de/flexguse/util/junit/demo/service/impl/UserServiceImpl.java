/**
 * 
 */
package de.flexguse.util.junit.demo.service.impl;

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
