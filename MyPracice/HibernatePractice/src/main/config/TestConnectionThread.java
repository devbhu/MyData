
public class TestConnectionThread extends Thread{

	
	@Override
	public void run() {
		TestConfigHibernate.main(null);
	}
	
	public static void main(String[] args) {
		
		TestConnectionThread t1 = new TestConnectionThread();
		TestConnectionThread t2 = new TestConnectionThread();
		TestConnectionThread t3 = new TestConnectionThread();
		TestConnectionThread t4 = new TestConnectionThread();
		TestConnectionThread t5 = new TestConnectionThread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
	
}
