package com.test.reentrant.lock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Banks {

	volatile int accountAmount = 0;

	private ReentrantLock bankLock = null;

	private Condition cond = null;

	/**
	 * @return the accountAmount
	 */
	public int getAccountAmount() {
		return accountAmount;
	}

	/**
	 * @param accountAmount
	 *            the accountAmount to set
	 */
	public void setAccountAmount(int accountAmount) {
		this.accountAmount = accountAmount;
	}

	{
		bankLock = new ReentrantLock();

		cond = bankLock.newCondition();

	}

	public void transferFunds(int amount) {

		bankLock.lock();
		try {
			
			while (accountAmount < amount) {

				try {
					cond.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			System.out.println(Thread.currentThread().getName()
					+ " successfully transferred the fund " + amount);
			accountAmount = accountAmount - amount;
			
			//cond.signalAll();

		} finally {

			bankLock.unlock();
		}
	}
	
	
	public void provideSignal(){
		try{
		bankLock.lock();
		
		cond.signalAll();
		}
		finally{
			bankLock.unlock();
		}
	}

}

public class UsingConditionObjects {

	public static void main(String[] args) {

		final Banks b = new Banks();

		for (int i = 1; i <= 10; i++) {

			Thread t1 = new Thread() {

				@Override
				public void run() {

					b.transferFunds(500);

				}

			};

			t1.start();

		}

		System.out.println("How much you want to deposit ?? ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();

		b.setAccountAmount(value);
		
		b.provideSignal();

		System.out.println("Do you want to see the final account amount ?? ");

		Scanner scan1 = new Scanner(System.in);

		if ("Y".equalsIgnoreCase(scan1.next())) {

			System.out.println("Final remaining amount : "
					+ b.getAccountAmount());

		}

	}

}
