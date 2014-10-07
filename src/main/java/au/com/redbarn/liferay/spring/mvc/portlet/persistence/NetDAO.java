/**
 * 
 */
package au.com.redbarn.liferay.spring.mvc.portlet.persistence;

import org.springframework.stereotype.Component;

/**
 * A DAO for the network data.
 * 
 * @author peter
 *
 */
@Component
public interface NetDAO {
	
	/**
	 * Returns the user that consumed the most bandwidth today.
	 * 
	 * @return The user that consumed the most bandwidth today.
	 */
	public String getMaxBandwithUserToday();
}
