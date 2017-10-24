package test.producer.consumer.tenthreads;

public class Main {
	
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			ConsumerThread ct = new ConsumerThread();
			ct.setName("Consumer");
			ProducerThread pt = new ProducerThread();
			pt.setName("Producer");
			ct.start();
			pt.start();
			
		}
	}

}
