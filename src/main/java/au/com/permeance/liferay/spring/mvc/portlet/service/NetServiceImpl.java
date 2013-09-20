/**
 * 
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.permeance.liferay.spring.mvc.portlet.persistence.NetDAO;

/**
 * Some network related services.
 * 
 * @author peter
 *
 */
@Service
public class NetServiceImpl implements NetService {
	
	/**
	 * The net DAO.
	 */
	@Autowired
	NetDAO netDAO;

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.NetService#getBandwithHog()
	 */
	@Override
	public String getBandwithHog() {
		
		String bandwidthHog = netDAO.getMaxBandwithUserToday();
		
		// If Mark Scott is today's bandwidth hog, blame it on Big Ted.
		if ("Mark Scott".equals(bandwidthHog)) {
			bandwidthHog = "Big Ted";
		}

		return bandwidthHog;
	}
}
