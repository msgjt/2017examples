package jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {
	
	public String getHelloWorld() {
		return "Hello World from a Bean!";
	}

}
