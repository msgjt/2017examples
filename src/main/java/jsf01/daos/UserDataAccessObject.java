/**
 * 
 */
package jsf01.daos;


import javax.enterprise.context.RequestScoped;

import jsf01.entities.User;

/**
 * @author Mihaly Fodor
 */
@RequestScoped
public class UserDataAccessObject {

	public User getUser(String userName, String password) {
		return new User("test", "test");
	}

}
