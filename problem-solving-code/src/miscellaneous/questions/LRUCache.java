package miscellaneous.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap
{
	private int size;

	public static void main(String[] args)
	{
		LRUCache cache = LRUCache.newInstance(4);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(1, 1);
		cache.put(3, 3);
		cache.put(4, 4);

		System.out.println(cache);
	}

	private LRUCache(int size)
	{
		super(size, 0.75f, true);
		this.size = size;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry eldest)
	{
		return size() > size;
	}

	public static LRUCache newInstance(int size)
	{
		return new LRUCache(size);
	}

}