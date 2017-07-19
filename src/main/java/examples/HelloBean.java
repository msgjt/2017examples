/**
 * 
 */
package examples;

/**
 * @author Mihaly Fodor
 *
 */
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = -7828490240688231419L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// JSF Action, with navigation outcome
	public String sayHello() {
		// hardcoded navigation, it's a bad idea :)
		name = name + "i almost made a huge mistake";
		return "welcome";
		// return "welcomeWrongPage";
	}
}
