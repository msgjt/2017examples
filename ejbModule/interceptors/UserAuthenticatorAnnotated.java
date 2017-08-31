package interceptors;

import javax.inject.Named;

import interceptors.annotations.NotNullable;

@Named
public class UserAuthenticatorAnnotated {

	public boolean loginUserNoParam(){
		return true;
	}
	
	@NotNullable
	public boolean loginUserWithOneParam(Object user){
		return true;
	}
	
	public boolean loginUserWithMultipleParam(Object user, boolean secured){
		return true;
	}
}
