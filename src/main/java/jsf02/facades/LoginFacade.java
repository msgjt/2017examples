/**
 * 
 */
package jsf02.facades;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import jsf02.daos.UserDataAccessObject;
import jsf02.entities.User;

/**
 * @author Mihaly Fodor
 */
@RequestScoped
public class LoginFacade {

	@Inject
	private UserDataAccessObject userDao;

	public boolean isValidUser(User user) {

		User savedUser = userDao
				.getUser(user.getUserName(), user.getPassword());

		if (savedUser == null) {
			return false;
		}

		return savedUser.equals(user);
	}
}
