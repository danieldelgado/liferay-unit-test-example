/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.liferay.portal.util.PortalUtil;

/**
 * @author peter
 *
 */
@Service
public class PortalServiceImpl implements PortalService {

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.PortalService#getUptime()
	 */
	@Override
	public long getUptime() {
		return (new Date()).getTime() - PortalUtil.getUptime().getTime(); // now - the time the portal came up
	}

	/* (non-Javadoc)
	 * @see au.com.permeance.liferay.spring.mvc.portlet.service.PortalService#getDefaultCompanyId()
	 */
	@Override
	public long getDefaultCompanyId() {
		return PortalUtil.getDefaultCompanyId();
	}
}
