/**
 * 
 */
package au.com.redbarn.liferay.spring.mvc.portlet.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Utilities related to home type stuff.
 * 
 * @author peter
 *
 */
public class HomeUtil {
	
	/**
	 * Gets a random string from a list of them.
	 * 
	 * @param strings The list of strings to choose a random one from.
	 * @return The random string from the list.
	 */
	public static String getRandomString(List<String> strings){
		Random random = new Random(new Date().getTime());
		int randomMessageIndex = random.nextInt(strings.size());
		return strings.get(randomMessageIndex);
	}
}
