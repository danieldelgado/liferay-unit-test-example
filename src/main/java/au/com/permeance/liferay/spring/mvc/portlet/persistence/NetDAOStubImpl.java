/**
 * 
 */
package au.com.permeance.liferay.spring.mvc.portlet.persistence;

import org.springframework.stereotype.Component;

/**
 * A DAO for the network data.
 * 
 * @author peter
 *
 */
@Component
public class NetDAOStubImpl implements NetDAO {

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.persistence.NetDAO#getMaxBandwithUserToday()
	 */
	@Override
	public String getMaxBandwithUserToday() {
		return "Big Ted";
	}
}
