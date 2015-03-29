/**
 * 
 */
package de.flexguse.util.junit.demo.model;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

/**
 * Spring configuration for {@link UserValidationTest}.
 * 
 * @author Christoph Guse, info@flexguse.de
 *
 */
@Configuration
public class UserValidationTestConfiguration {

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

}
