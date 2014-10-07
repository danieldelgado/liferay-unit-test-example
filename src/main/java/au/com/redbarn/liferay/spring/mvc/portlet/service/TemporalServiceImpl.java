/**
 * 
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Service;

/**
 * Services that relate to time.
 * 
 * @author peter
 *
 */
@Service
public class TemporalServiceImpl implements TemporalService {

	/* (non-Javadoc)
	 * @see au.com.redbarn.liferay.spring.mvc.portlet.service.TemporalService#getFormattedDate()
	 */
	@Override
	public String getFormattedDate(Locale locale) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		return dateFormat.format(date);
	}
}
