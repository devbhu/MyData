package test.concurrent.counter;

public class AtomicCounter {

	private volatile int counter = 0;
	
	public  int incrementAndGet() {	
		synchronized (this) {
		counter++ ;
		    System.out.println(Thread.currentThread().getName()+" incrementing "+counter);
		}
		return counter;	
	}
	
	public  int decrementAndGet() {	
		synchronized (this) {
		counter-- ;
		System.out.println(Thread.currentThread().getName()+" decrementing "+counter);
			
		}
		return counter;	
	}
	
	
	
}
