package test.producer.consumer.tenthreads;

public class ProducerThread extends Thread{
	
	
	@Override
	public void run() {
		ProducerConsumer.getInstance().produce();
	}
	

}
