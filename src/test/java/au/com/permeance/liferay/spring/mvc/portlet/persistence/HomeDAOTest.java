/**
 * 
 */
package au.com.permeance.liferay.spring.mvc.portlet.persistence;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.com.permeance.liferay.spring.mvc.portlet.persistence.HomeDAO;

/**
 * Tests for {@link HomeDAO}.
 * 
 * @author peter
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class HomeDAOTest {
	
	/**
	 * The class under test.
	 */
	@Autowired
	HomeDAO homeDAO;
	
	@Test
	public void getMessages() {
		List<String> messages = homeDAO.getMessages();
		Assert.assertEquals("The list is the wrong size.", 6, messages.size());
		Assert.assertEquals("Message 1 is incorrect.", "Oli, move your bike.", messages.get(0));
		Assert.assertEquals("Message 2 is incorrect.", "Time to go home.", messages.get(1));
		Assert.assertEquals("Message 3 is incorrect.", "Gus, time for a stretch.", messages.get(2));
		Assert.assertEquals("Message 4 is incorrect.", "Time for standup.", messages.get(3));
		Assert.assertEquals("Message 5 is incorrect.", "Cake time.", messages.get(4));
		Assert.assertEquals("Message 6 is incorrect.", "Beer time.", messages.get(5));
	}
}
