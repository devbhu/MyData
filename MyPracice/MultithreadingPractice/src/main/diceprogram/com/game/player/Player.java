package com.game.player;

import java.util.concurrent.ThreadLocalRandom;

public class Player extends Thread{
	
	private DiceGameController controller;
	
	private final ThreadLocalRandom random= ThreadLocalRandom.current();
	
	private int score = 0;
	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	public Player(DiceGameController controller) {
		
		this.controller=controller;
		
	}

	
	/**
	 * @return the diceValue
	 */
	public Integer getDiceValue() {
		
		int randomValue = random.nextInt(6)+1;
		score = score+randomValue;
		return randomValue;
	}

	@Override
	public void run() {
		
		for(int i=0;i<1000;i++)
		controller.taskPerPlayer(); 
		
		System.out.println(Thread.currentThread().getName() +" has scored "+getScore());
		
		
		
		
	}

}
