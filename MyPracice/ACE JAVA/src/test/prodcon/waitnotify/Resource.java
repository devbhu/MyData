package test.prodcon.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class Resource {
	private static final List<Integer> BUFFER = new ArrayList<>();
	private static final int MAX_BUFFER_SIZE = 20;
	private static final int MIN_BUFFER_SIZE = 0;
	private volatile static Resource res = null;

	private Resource() {
	}

	public static Resource getInstance() {
		if (res == null) {
			synchronized (Resource.class) {
				if (res == null) {
					res = new Resource();
				}
			}
		}
		return res;
	}

	public void produce(int val) {

		synchronized (BUFFER) {
			if (BUFFER.size() == MAX_BUFFER_SIZE) {
				try {
					BUFFER.notify();
					BUFFER.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			boolean isAdded = BUFFER.add(val);
			if (isAdded)
				System.out.println(Thread.currentThread().getName()
						+ " produces " + val);
			BUFFER.notify();
		}
	}

	public void consume(Integer val) {

		synchronized (BUFFER) {
			if (BUFFER.size() == MIN_BUFFER_SIZE) {
				try {
					BUFFER.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			boolean isRemoved = BUFFER.remove(val);
			if (isRemoved)
				System.out.println(Thread.currentThread().getName()
						+ " consumes " + val);
			BUFFER.notify();
		}
	}

}
