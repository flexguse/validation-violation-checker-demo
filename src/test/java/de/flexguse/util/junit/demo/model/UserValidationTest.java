/**
 * 
 */
package de.flexguse.util.junit.demo.model;

import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.flexguse.util.junit.ValidationViolationChecker;

/**
 * This tests show how to use JSR303 bean validation in spring projects and
 * shows how to use the {@link ValidationViolationChecker} correctly.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UserValidationTestConfiguration.class })
public class UserValidationTest {

	@Autowired
	private Validator validator;

	private ValidationViolationChecker<User> userValidationChecker = new ValidationViolationChecker<>();

	/**
	 * Tests if an empty User is validated correctly.
	 */
	@Test
	public void testInvalidUserValidation() {

		// do the validation
		Set<ConstraintViolation<User>> validationErrors = validator
				.validate(User.builder().build());

		// do the validation expectation check
		userValidationChecker.checkExpectedValidationViolations(
				validationErrors, Arrays.asList(UserErrorMessages.NO_EMAIL,
						UserErrorMessages.NO_LOGIN,
						UserErrorMessages.NO_PASSWORD));

	}

	/**
	 * Tests if invalid user data is validated correctly.
	 */
	@Test
	public void testInvalidEmailLoginPassword() {

		// create the invalid user
		User user = User.builder().eMail("invalid-mail").login("dre")
				.password("0123456").build();

		// do the validation
		Set<ConstraintViolation<User>> validationErrors = validator
				.validate(user);

		// do the validation expectation check
		userValidationChecker.checkExpectedValidationViolations(
				validationErrors, Arrays.asList(
						UserErrorMessages.INVALID_EMAIL,
						UserErrorMessages.TOO_SHORT_LOGIN,
						UserErrorMessages.TOO_SHORT_PASSWORD));

	}

	/**
	 * Tests if an invalid {@link Address} is validated correctly.
	 */
	@Test
	public void testInvalidAddress() {

		// create valid user with invalid address
		User user = User.builder().eMail("info@flexguse.de").login("flexguse")
				.password("some-very-nice-password")
				.address(Address.builder().build()).build();

		// do the validation
		Set<ConstraintViolation<User>> validationErrors = validator
				.validate(user);

		// do the validation expectation check
		userValidationChecker.checkExpectedValidationViolations(
				validationErrors, Arrays.asList(AddressErrorMessages.NO_CITY,
						AddressErrorMessages.NO_COUNTRY,
						AddressErrorMessages.NO_HOUSENUMBER,
						AddressErrorMessages.NO_STREET,
						AddressErrorMessages.NO_ZIP_CODE));

	}

}
