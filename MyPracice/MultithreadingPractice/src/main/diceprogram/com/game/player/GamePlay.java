package com.game.player;

public class GamePlay {
	
	public static void main(String[] args) {
		
		DiceGameController controller = new DiceGameController();
		
		Player p1 = new Player(controller);
		Player p2 = new Player(controller);
		p1.setName("Player 1");
		p2.setName("Player 2");
		
		p1.start();
		p2.start();
		
		
		
		
	}

}
