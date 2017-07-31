/**
 * 
 */
package jsf02;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jsf02.entities.User;
import jsf02.facades.UsersFacade;

/**
 * @author Mihaly Fodor
 */
@Named
@ViewScoped
// pentru EJB trebuie importat javax.faces.bean.ViewScoped
public class UsersBean implements Serializable {

	private static final long serialVersionUID = 4860933911207569401L;

	@Inject
	private UsersFacade userFacade;
	
	private User editedUser;
	
	public String doSaveEditedUser() {
		System.err.println("Editing the User " + editedUser);
		editedUser = null;
		return "users";
	}

	public List<User> getAllUsers() {
		return userFacade.getRandomUsers(13);
	}
	
	public void destroyWorld() {
        addMessage("System Error", "Please try again later.");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public User getEditedUser() {
		return editedUser;
	}

	public void setEditedUser(User editedUser) {
		this.editedUser = editedUser;
	}
	
}
