package decorators;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class InMemoryCache implements Cache{

	private ConcurrentHashMap<String, Object> memoryCache;
	
	@PostConstruct
	public void init(){
		this.memoryCache = new ConcurrentHashMap<>();
	}

	@Override
	public void cache(String key, Object value) {
		this.memoryCache.put(key, value);
		
	}

	@Override
	public Object fetch(String key) {
		return this.memoryCache.get(key);
	}
	
	
}
