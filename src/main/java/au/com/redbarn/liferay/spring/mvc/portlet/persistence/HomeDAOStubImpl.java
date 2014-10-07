/**
 *
 */
package au.com.redbarn.liferay.spring.mvc.portlet.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * An interface to the messages in the db.
 *
 * @author peter
 *
 */
@Component
public class HomeDAOStubImpl implements HomeDAO {

	/* (non-Javadoc)
	 * @see au.com.redbarn.liferay.spring.mvc.portlet.persistence.HomeDAO#getMessages()
	 */
	@Override
	public List<String> getMessages() {
		List<String> messages = new ArrayList<String>();
		messages.add("Oli, move your bike.");
		messages.add("Time to go home.");
		messages.add("Gus, time for a stretch.");
		messages.add("Time for standup.");
		messages.add("Cake time.");
		messages.add("Beer time.");

		return messages;
	}
}
