package decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public abstract class CacheChangeNotifier implements Cache{
	
	@Inject @Delegate
	Cache cache;

	@Override
	public void cache(String key, Object value) {
		System.out.println("added new " + key + " to the memory cache");
		this.cache.cache(key, value);
	}
	
	
}
