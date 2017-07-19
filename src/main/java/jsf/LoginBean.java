package jsf;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = -1639988756133194674L;

	public String getHelloWorld() {
		return "Hello World from a Bean!";
	}

}
