package test.producer.consumer.tenthreads;

public class ConsumerThread extends Thread{
	
	@Override
	public void run() {
		ProducerConsumer.getInstance().consume();
	}

}
