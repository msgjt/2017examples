package decorators;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CacheTest {
	
	@EJB
	Cache cache;

//	@Schedule(second="10", minute="*", hour="*")
//	public void loginWithOneParamNotNull() {
//		System.out.println("loginWithOneParamNotNull::");
//		cache.cache("Key1", "Value1");
//		cache.cache("Key2", "Value2");
//		cache.cache("Key3", "Value3");
//	} 
}
