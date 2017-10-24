package com.test.reentrant.lock;

class Bankss{
	
	int accountAmount = 100;
	
	synchronized public void transferAmountToAccount(int amount,Bankss target){
		
		//Runnable runnable =Thread.currentThread();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	AccountTransfer accountThread = (AccountTransfer)runnable;
		
		//Bankss target = accountThread.getTargetBank();
		
		synchronized(target){
			
			target.accountAmount=target.accountAmount-amount;
			
		}
		
		
	}
	
}


class AccountTransfer implements Runnable{
   
	Bankss sourceBank;
	/**
	 * @return the targetBank
	 */
	public Bankss getTargetBank() {
		return targetBank;
	}

	/**
	 * @param targetBank the targetBank to set
	 */
	public void setTargetBank(Bankss targetBank) {
		this.targetBank = targetBank;
	}

	Bankss targetBank;
	
	public AccountTransfer(Bankss sourceBank,Bankss targetBank) {
	  this.sourceBank =sourceBank;
	  this.targetBank=targetBank;
	}
	
	@Override
	public void run() {

		sourceBank.transferAmountToAccount(50,targetBank);
		
	}
	
	
	
	
}

public class DeadLockTest  {


	//Minimum two resources are needed to achieve deadlock condition
	public static void main(String[] args) throws InterruptedException {
		
		Bankss source = new Bankss();
		
		Bankss target = new Bankss();
		
		AccountTransfer ac1 = new AccountTransfer(source, target);
		AccountTransfer ac2 = new AccountTransfer(target, source);
		
		Thread t1 = new Thread(ac1);
		Thread t2 = new Thread(ac2);
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println(t1.getState().name());
		System.out.println(t2.getState().name());
		
		
		
	}
	
	
	
}
