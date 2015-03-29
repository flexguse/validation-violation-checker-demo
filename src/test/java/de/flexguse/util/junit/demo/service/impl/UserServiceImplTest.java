/**
 * 
 */
package de.flexguse.util.junit.demo.service.impl;

import static org.junit.Assert.fail;

import java.util.Arrays;

import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.flexguse.util.junit.ValidationViolationChecker;
import de.flexguse.util.junit.demo.model.User;
import de.flexguse.util.junit.demo.model.UserErrorMessages;
import de.flexguse.util.junit.demo.service.UserService;

/**
 * This test demonstrates how to use the {@link ValidationViolationChecker} in
 * combination with Spring method validation.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UserServiceImplTestConfiguration.class })
public class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@SuppressWarnings("rawtypes")
	private ValidationViolationChecker validationChecker = new ValidationViolationChecker();

	/**
	 * Tests if the invalid user object is validated correctly when calling the
	 * {@link UserService}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testInvalidUserServiceMethodValidation() {

		try {
			userService.saveUser(User.builder().build());
			fail("expected to get validation errors when calling method");
		} catch (ConstraintViolationException e) {
			validationChecker.checkExpectedValidationViolations(e
					.getConstraintViolations(), Arrays.asList(
					UserErrorMessages.NO_EMAIL, UserErrorMessages.NO_LOGIN,
					UserErrorMessages.NO_PASSWORD));
		}

	}
}
