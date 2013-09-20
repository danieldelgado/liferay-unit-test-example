/**
 * 
 */
package au.com.permeance.liferay.spring.mvc.portlet.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * An interface to the messages in the db.
 * 
 * @author peter
 *
 */
@Component
public interface HomeDAO {
	
	/**
	 * Gets the messages from the db.
	 * 
	 * @return The messages from the db.
	 */
	public List<String> getMessages();
}
