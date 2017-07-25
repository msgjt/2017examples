package jsf02;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AjaxBean implements Serializable {
	
	private static final long serialVersionUID = -3381453926075333683L;
	
	private String valueOne;
	private String valueTwo;
	
	public String getValueOne() {
		return valueOne;
	}
	public void setValueOne(String valueOne) {
		this.valueOne = valueOne;
	}
	public String getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(String valueTwo) {
		this.valueTwo = valueTwo;
	}

}
