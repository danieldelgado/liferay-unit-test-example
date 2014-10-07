/**
 * 
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

import au.com.redbarn.liferay.spring.mvc.portlet.service.HomeUtil;

/**
 * Tests for {@link HomeUtil}.
 * 
 * @author peter
 *
 */

public class HomeUtilTest {
	
	@Test
	public void getRandomString() {
		
		// set up test data
		List<String> strings = new ArrayList<String>();
		strings.add("String 1.");
		strings.add("String 2.");
		
		// test the method
		String string = HomeUtil.getRandomString(strings);
		
		// test results
		Assert.notNull(string, "Message must not be null.");
		Assert.hasText(string, "Message must not be empty.");
	}
}
