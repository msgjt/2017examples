/**
 * 
 */
package jsf02;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jsf02.entities.User;
import jsf02.facades.UsersFacade;

/**
 * @author Mihaly Fodor
 */
@Named
@RequestScoped
public class UsersBean implements Serializable {

	private static final long serialVersionUID = 4860933911207569401L;

	@Inject
	private UsersFacade userFacade;

	public List<User> getAllUsers() {
		return userFacade.getRandomUsers(13);
	}
}
