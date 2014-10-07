/**
 *
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.util.Locale;

import org.springframework.stereotype.Service;

/**
 * Provides messages to the user.
 *
 * @author peter
 *
 */
@Service
public interface HomeService {

	/**
	 * Get a message for the user.
	 *
	 * @return A message for the user.
	 */
	public String getMessage();

	/**
	 * Get the current day's bandwith hog.
	 *
	 * @return Today's bandwidth hog.
	 */
	public String getBandwithHog();

	/**
	 * Get the current date and time formatted long style.
	 *
	 * @param locale The caller's locale.
	 * @return The current date and time formatted long style.
	 */
	public String getFormattedDate(Locale locale);

	/**
	 * Gets the portal's uptime.
	 *
	 * @return The portal's uptime.
	 */
	public long getUptime();

	/**
	 * Gets the default company id from Liferay.
	 *
	 * @return The default company id from Liferay.
	 */
	public long getDefaultCompanyId();
}
