/**
 * 
 */
package de.flexguse.util.junit.demo.service.impl;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import de.flexguse.util.junit.demo.service.UserService;

/**
 * Spring configuration for {@link UserServiceImplTest}.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Configuration
public class UserServiceImplTestConfiguration {

	/**
	 * The spring framework factory which provides the JSR303 validator. Use
	 * something like
	 * 
	 * <pre>
	 * &#064;Autowired
	 * private Validator validator;
	 * </pre>
	 * 
	 * for getting an {@link Validator} instance autowired.
	 * 
	 * @return
	 */
	@Bean
	public SpringValidatorAdapter validator() {

		return new LocalValidatorFactoryBean();

	}

	/**
	 * This spring framework bean postprocessor enables JSR303 bean validation
	 * for method arguments.
	 * 
	 * <p>
	 * Must only be configured and is used automatically by spring.
	 * </p>
	 * 
	 * @return
	 */
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		final MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
		methodValidationPostProcessor.setValidator(validator());

		return methodValidationPostProcessor;
	}

	/**
	 * To enable JSR303 bean validation for service methods even for testclasses
	 * spring must be used to create the service instance so the
	 * {@link MethodValidationPostProcessor} is added and validation is done.
	 * 
	 * @return
	 */
	@Bean
	public UserService userService() {

		return new UserServiceImpl();

	}

}
