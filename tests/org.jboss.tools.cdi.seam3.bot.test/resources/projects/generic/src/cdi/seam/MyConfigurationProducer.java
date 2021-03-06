package cdi.seam;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class MyConfigurationProducer {
	
	/**
	 * Configuration created by field producer.
	 */
	@Produces
	@MyGenericType("first")
	@Default
	MyConfiguration getOneConfig() {
		return null;
	}

	/**
	 * Configuration created by method producer with specified scope.
	 */
	@Produces
	@MyGenericType("second")
	@Qualifier1
	@SessionScoped
	MyConfiguration getSecondConfig() {
		return null;
	}
}