/**
 *
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import au.com.redbarn.liferay.spring.mvc.portlet.persistence.HomeDAO;
import au.com.redbarn.liferay.spring.mvc.portlet.service.HomeService;
import au.com.redbarn.liferay.spring.mvc.portlet.service.HomeServiceImpl;
import au.com.redbarn.liferay.spring.mvc.portlet.service.HomeUtil;
import au.com.redbarn.liferay.spring.mvc.portlet.service.NetService;
import au.com.redbarn.liferay.spring.mvc.portlet.service.PortalService;
import au.com.redbarn.liferay.spring.mvc.portlet.service.TemporalService;


/**
 * Tests for {@link HomeService}.
 *
 * @author peter
 *
 */
@RunWith(PowerMockRunner.class)
@ContextConfiguration("classpath:test-context.xml")
@PrepareForTest(HomeUtil.class)
public class HomeServiceTest {

	@Mock
	private HomeDAO homeDAO;

	@Mock
	private NetService netService;

	@Mock
	private TemporalService temporalService;

	@Mock
	private PortalService portalService;

	@InjectMocks
	private HomeService homeService = new HomeServiceImpl();

	@Test
	public void getMessage() {

		// configure mocks
		List<String> messages = new ArrayList<String>();
		messages.add("Test message 1");
		messages.add("Test message 2");
		Mockito.when(homeDAO.getMessages()).thenReturn(messages);

		PowerMockito.mockStatic(HomeUtil.class);
		Mockito.when(HomeUtil.getRandomString(messages)).thenReturn("Test message 1");

		// execute method
		String message = homeService.getMessage();

		// check the results
		Assert.notNull(message, "Message must not be null.");
		Assert.hasText(message, "Message must not be empty.");
	}

	@Test
	public void getMessageNoMessages() {
		String message = homeService.getMessage();
		Assert.isNull(message, "Message must be null.");
	}

	@Test
	public void getBandwithHog() {

		final String BIG_TED = "Big Ted";

		// configure mock
		Mockito.when(netService.getBandwithHog()).thenReturn(BIG_TED);

		// execute method
		String bandwidthHog = homeService.getBandwithHog();

		// check the results
		Assert.isTrue(BIG_TED.equals(bandwidthHog), "We have the wrong bandwith hog.");
	}

	@Test
	public void getFormattedDate() {

		final String FORMATTED_DATE = "12 August 2013 00:48:45 EST";

		Locale locale = new Locale("eng", "AU");

		// configure mock
		Mockito.when(temporalService.getFormattedDate(locale)).thenReturn(FORMATTED_DATE);

		// execute method
		String formattedDate = homeService.getFormattedDate(locale);

		// check the results
		Assert.isTrue(FORMATTED_DATE.equals(formattedDate), "The formatted date did not pass through the facade correctly.");
	}

	@Test
	public void getUptime() {

		// configure mock
		Mockito.when(homeService.getUptime()).thenReturn(1L);

		// execute method
		long uptime = homeService.getUptime();

		// check the results
		Assert.isTrue(uptime > 0, "Zero uptime, something is very wrong.");
	}

	@Test
	public void getDefaultCompanyId() {

		// configure mock
		Mockito.when(homeService.getDefaultCompanyId()).thenReturn(1L);

		// execute method
		long defaultCompanyId = homeService.getDefaultCompanyId();

		// check the results
		Assert.isTrue(defaultCompanyId == 1L, "The company id is wrong.");
	}
}
