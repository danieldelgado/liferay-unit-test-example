/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import au.com.permeance.liferay.spring.mvc.portlet.persistence.NetDAO;

/**
 * Tests for {@link NetService}.
 *
 * @author peter
 *
 */
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class NetServiceTest {

	@Mock
	NetDAO netDAO;

	@InjectMocks
	private NetService netService = new NetServiceImpl();

	/**
	 * Test getBandwithHog() for all users that aren't Mark Scott.
	 */
	@Test
	public void getBandwithHog() {

		// configure mock
		Mockito.when(netDAO.getMaxBandwithUserToday()).thenReturn("Little Ted");

		// execute method
		String bandwidthHog = netService.getBandwithHog();

		// check results
		Assert.hasText(bandwidthHog, "There must be a bandwidth hog.");
		Assert.doesNotContain(bandwidthHog, "Mark Scott");
		Assert.isTrue("Little Ted".equals(bandwidthHog), "The bandwidth hog is wrong.");
	}
	
	/**
	 * Test getBandwithHog() for Mark Scott. Tests the business logic that blames Mark Scott's bandwidth consumption on Big Ted.
	 */
	@Test
	public void getMarkScottBandwidthHog() {

		// configure mock
		Mockito.when(netDAO.getMaxBandwithUserToday()).thenReturn("Mark Scott");

		// execute method
		String bandwidthHog = netService.getBandwithHog();

		// check results
		Assert.hasText(bandwidthHog, "There must be a bandwidth hog.");
		Assert.doesNotContain(bandwidthHog, "Mark Scott");
		Assert.isTrue("Big Ted".equals(bandwidthHog), "The bandwidth hog is wrong.");
	}
}
