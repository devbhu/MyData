package test.cyclicbarrier.impl;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread{
	
	private String playerName;
	private DiceGame diceGame;
	private CyclicBarrier barrier;
	public Player(String playerName, DiceGame diceGame, CyclicBarrier barrier) {
		super();
		this.playerName = playerName;
		this.diceGame = diceGame;
		this.barrier = barrier;
		setName(playerName);
	}
	
	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName()+" has joined!!!");
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			barrier.reset();
			e.printStackTrace();
			
		}
		while(!Thread.currentThread().isInterrupted())
		diceGame.startGame();
		
		
		
	}

}
