/**
 * 
 */
package jsf01;

/**
 * @author Mihaly Fodor
 */
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import jsf01.entities.User;
import jsf01.facades.LoginFacade;

@Named
@RequestScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = -2617767540112561117L;

	private User user = new User();

	@Inject
	private LoginFacade loginFacade;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public String processLogin() {
		if (loginFacade.isValidUser(user)) {
			getFacesContext().addMessage(null, new FacesMessage("We logged in, yey"));
			return "loginSuccess";
		} else {
			getFacesContext().addMessage("loginForm:username", new FacesMessage("Password or Username wrong!"));
			return "loginFailed";
		}
	}

	/**
	 * Sadly FacesContext is not injectable. For Consistency's sake the recommended way of getting it
	 * is with a producer.
	 * 
	 * @return {@link FacesContext}
	 */
	@Produces
	@RequestScoped
	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}