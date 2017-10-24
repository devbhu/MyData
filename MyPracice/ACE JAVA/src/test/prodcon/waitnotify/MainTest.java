package test.prodcon.waitnotify;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {

		ConsumerThread ct = new ConsumerThread();
		ct.setName("Consumer Thread");
		ct.setPriority(6);
		ct.start();
		ProducerThread pt = new ProducerThread();
		pt.setName("ProducerThread");
		pt.setPriority(1);
		pt.start();

	}

}
