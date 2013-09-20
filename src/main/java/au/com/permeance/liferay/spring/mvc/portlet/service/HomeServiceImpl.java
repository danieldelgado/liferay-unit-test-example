/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.permeance.liferay.spring.mvc.portlet.persistence.HomeDAO;

/**
 * Provides messages to the user.
 *
 * @author peter
 *
 */
@Service
public class HomeServiceImpl implements HomeService {

	/**
	 * Our home DAO.
	 */
	@Autowired
	HomeDAO homeDAO;
	
	/**
	 * A {@link NetService}.
	 */
	@Autowired
	NetService netService;
	
	/**
	 * A {@link TemporalService}.
	 */
	@Autowired
	TemporalService temporalService;
	
	/**
	 * A {@link PortalService}.
	 */
	@Autowired
	PortalService portalService;

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.HomeService#getMessage()
	 */
	@Override
	public String getMessage() {

		List<String> messages = homeDAO.getMessages();

		if (messages.size() > 0 ) {
			return HomeUtil.getRandomString(messages);
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.HomeService#getBandwithHog()
	 */
	@Override
	public String getBandwithHog() {
		return netService.getBandwithHog();
	}

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.HomeService#getFormattedDate(java.util.Locale)
	 */
	@Override
	public String getFormattedDate(Locale locale) {
		return temporalService.getFormattedDate(locale);
	}

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.HomeService#getUptime()
	 */
	@Override
	public long getUptime() {
		return portalService.getUptime();
	}

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.HomeService#getDefaultCompanyId()
	 */
	@Override
	public long getDefaultCompanyId() {
		return portalService.getDefaultCompanyId();
	}
}
