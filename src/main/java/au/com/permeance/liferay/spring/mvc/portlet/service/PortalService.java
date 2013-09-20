/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import org.springframework.stereotype.Service;

/**
 * Portal related services.
 *
 * @author peter
 *
 */
@Service
public interface PortalService {

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
