package test.countdown.latch;


public class Theatre {

	private static Theatre theatre = null;

	private Theatre() {
	}

	public static synchronized Theatre getInstance() {
		if (theatre == null) {
			theatre = new Theatre();
		}
		return theatre;
	}

	public void watchingShow() {
		System.out.println(Thread.currentThread().getName()
				+ " is watching the show");
	}

}
