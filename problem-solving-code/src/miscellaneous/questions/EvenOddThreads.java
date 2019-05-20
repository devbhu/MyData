package miscellaneous.questions;

public class EvenOddThreads {

	public static void main(String[] args) {
		Payload payload = new Payload(30);
		Printer1 a = new Printer1(payload,"odd thread");
		Printer1 b = new Printer1(payload,"even thread");

		a.start();
		b.start();
		
	}
}

class Printer1 extends Thread {
	Payload payload;
	String name;
	static boolean type = false;
	String flag;

	public Printer1(Payload payload,String name) {
		this.payload = payload;
		this.name=name;

		//Any thread should be able to pick up printing job first.
		if (type == false) {
			flag = "First";
			type = true;
		} else {
			flag = "Second";
		}
	}

	public void run() {
		try {
			// Even Number
			if (flag.equals("First")) {
				System.out.println(this.getName() +name+ " " + flag);
				//System.out.println("dev");
				payload.printEven();
			} else {// Odd Number
				System.out.println(this.getName() +name+ " " + flag);
				payload.printOdd();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Payload {
	String name;
	int length;
	private int index=1;

	public Payload(int len) {
		length=len;
	}
	public synchronized void printOdd() throws InterruptedException {
		while (index < length) {
			//Thread.sleep(100);
			if (index % 2 == 0) {
				this.wait();
			}
			System.out.println(index);
			//System.out.println();
			index++;
			this.notifyAll();
			
		}
	}

	public synchronized void printEven() throws InterruptedException {
		while (index < length) {
			//Thread.sleep(300);
			if (index % 2 != 0) {
				this.wait();
			}
			System.out.println(index);
			index++;
			this.notifyAll();
		}
	}
}
