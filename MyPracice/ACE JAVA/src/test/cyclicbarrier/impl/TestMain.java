package test.cyclicbarrier.impl;

import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

public class TestMain {
	
	private static final CyclicBarrier barrier = new CyclicBarrier(DiceGame.numberOfPersons,new Runnable() {
		
		@Override
		public void run() {
			System.out.println("All the players joined.Game started enjoyy!!!");
		}
	}); 
	
	public static void main(String[] args) {
		
		DiceGame game = new DiceGameImpl();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The names of 5 Players !!!!");
		
		Player p1 = new Player(scan.nextLine(), game, barrier);
		Player p2 = new Player(scan.nextLine(), game, barrier);
		Player p3 = new Player(scan.nextLine(), game, barrier);
		Player p4 = new Player(scan.nextLine(), game, barrier);
		Player p5 = new Player(scan.nextLine(), game, barrier);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		
		
	}

}
