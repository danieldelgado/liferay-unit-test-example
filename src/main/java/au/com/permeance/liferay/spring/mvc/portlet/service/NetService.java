/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import org.springframework.stereotype.Service;

/**
 * Some network related services.
 * 
 * @author peter
 *
 */
@Service
public interface NetService {

	/**
	 * Get the current day's bandwith hog.
	 *
	 * @return Today's bandwidth hog.
	 */
	public String getBandwithHog();
}
