package interceptors;

import javax.interceptor.Interceptors;

@Interceptors(NotNullableInterceptor.class)
public class UserAuthenticator {

	public boolean loginUserNoParam(){
		return true;
	}
	
	public boolean loginUserWithOneParam(Object user){
		return true;
	}
	
	public boolean loginUserWithMultipleParam(Object user, boolean secured){
		return true;
	}
}
