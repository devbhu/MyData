package test.design.object.pool;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public abstract class ObjectPoolResource<T> {

	private int MAX_RESOURCE_COUNT = 10;

	private final Queue<T> objectPool = new ConcurrentLinkedQueue<>();

	private final Semaphore objectCreationcontroller = new Semaphore(MAX_RESOURCE_COUNT);

	public ObjectPoolResource(int initialSize) {

		for (int i = 0; i < initialSize; i++) {
			T obj = createObject();
			System.out.println("Creating initial connections on startup .." + obj);
			addObjectToPool(obj);
		}
	}

	private void addObjectToPool(T obj) {

		objectPool.offer(obj);
	}

	public final T getResource() {
		T resource = null;
		try {
			objectCreationcontroller.acquire();

			resource = objectPool.poll();

			if (resource == null) {

				resource = createObject();
				addObjectToPool(resource);
			}

		} catch (InterruptedException e) {
			objectCreationcontroller.release();
			e.printStackTrace();
		}

		return resource;
	}

	public final void releaseObject(T obj) {
		try {
			addObjectToPool(obj);
		} finally {
			objectCreationcontroller.release();
		}
	}

	abstract protected T createObject();

}
