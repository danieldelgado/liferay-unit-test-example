/**
 * 
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import java.util.Locale;

import org.springframework.stereotype.Service;

/**
 * Services that relate to time.
 * 
 * @author peter
 *
 */
@Service
public interface TemporalService {

	/**
	 * Get the current date and time formatted long style.
	 * 
	 * @param locale The caller's locale.
	 * @return The current date and time formatted long style.
	 */
	public String getFormattedDate(Locale locale);
}
