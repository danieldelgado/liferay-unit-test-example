/**
 *
 */
package au.com.redbarn.liferay.spring.mvc.portlet.persistence;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.com.redbarn.liferay.spring.mvc.portlet.persistence.NetDAO;

/**
 * Tests for {@link NetDAO}.
 *
 * @author peter
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class NetDAOTest {

	@Autowired
	NetDAO netDAO;

	@Test
	public void getMaxBandwithUserToday() {
		String bandwidthHog = netDAO.getMaxBandwithUserToday();
		Assert.assertEquals("Big Ted", bandwidthHog);
	}
}
