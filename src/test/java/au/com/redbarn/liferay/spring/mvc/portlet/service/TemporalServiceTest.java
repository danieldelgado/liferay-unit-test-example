/**
 * 
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import au.com.redbarn.liferay.spring.mvc.portlet.service.TemporalService;

/**
 * Tests for {@link TemporalService}.
 * 
 * @author peter
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class TemporalServiceTest {
	
	@Autowired
	private TemporalService temporalService;
	
	@Test
	public void getFormattedDate() {
		
		Locale locale = new Locale("eng", "AU");
		Date date = new Date();
		
		String formattedDate = temporalService.getFormattedDate(locale);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate2 = dateFormat.format(date);
		
		Assert.isTrue(formattedDate2.equals(formattedDate), "The formatted dates do not match. Try again, in case it was an unlucky 1/1000 glitch.");
	}
}
