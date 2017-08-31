package decorators;

public interface Cache {

	void cache(String key, Object value);
	Object fetch(String key);
}
