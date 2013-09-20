/**
 *
 */
package au.com.permeance.liferay.spring.mvc.portlet.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.liferay.portal.util.PortalUtil;

/**
 * Tests for {@link PortalService}.
 *
 * @author peter
 *
 */
@RunWith(PowerMockRunner.class)
@ContextConfiguration("classpath:test-context.xml")
@PrepareForTest(PortalUtil.class)
public class PortalServiceTest {

	@InjectMocks
	private PortalService portalService = new PortalServiceImpl();

	@Test
	public void getUptime() {

		// configure mocks
		PowerMockito.mockStatic(PortalUtil.class);
		Mockito.when(PortalUtil.getUptime()).thenReturn(new Date());

		// execute method
		long uptime = portalService.getUptime();

		// check the results
		Assert.isTrue(uptime > 0, "Zero uptime, something is very wrong.");
	}

	@Test
	public void getDefaultCompanyId() {

		// configure mocks
		PowerMockito.mockStatic(PortalUtil.class);
		Mockito.when(PortalUtil.getDefaultCompanyId()).thenReturn(1L);

		// execute method
		long defaultCompanyId = portalService.getDefaultCompanyId();

		// check the results
		Assert.isTrue(defaultCompanyId == 1L, "The company id is wrong.");
	}
}
