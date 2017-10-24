package test.cyclicbarrier.impl;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

public class DiceGameImpl implements DiceGame{
    
	private static final Random random = new Random();
	
	private static final Map<Thread,Integer> cache = new ConcurrentHashMap<>();
	
	private static volatile boolean flag = false;
	
	private static final Runnable r = new Runnable(){

		@Override
		public void run() {
			Thread t = null;
			int value = 0;
			Set entrySet = cache.entrySet();
			for(Object entry : entrySet){
				
				Map.Entry<Thread,Integer>  ent  = (Map.Entry)entry;
				
				if(t!=null && ent.getValue()>value){
					
					t.interrupt();
					cache.remove(t);
					t= ent.getKey();
					value=ent.getValue();
					
					
				}else if(t!=null && ent.getValue()<value ){
					
					ent.getKey().interrupt();
					cache.remove(ent.getKey());
	
				}
				
				if(t==null){	
				t= ent.getKey();
				value=ent.getValue();
				}
			}
			
		flag = true;
			
		}};
	
	
	private static volatile CyclicBarrier barrier = new CyclicBarrier(DiceGame.numberOfPersons,r);
	
	@Override
	public void startGame() {
	   
	   int value = random.nextInt(10);
	   System.out.println(Thread.currentThread().getName()+"  has thrown dice and generated a value : "+value);
	   cache.put(Thread.currentThread(),value);
	   try {
		barrier.await();
	} catch (InterruptedException | BrokenBarrierException e) {
		barrier.reset();
		e.printStackTrace();
	}
	   
	if(cache.size()==1 && !Thread.currentThread().isInterrupted()){
		
		stopGame();
		
	}  
	
	synchronized (barrier) {
		if(cache.size()>1 && flag){
		barrier = new CyclicBarrier(cache.size(),r);
		flag = false;
		}
		
	}
		
		
	
  }

	private void stopGame() {
		
		System.out.println("The winner is :"+cache.keySet().iterator().next().getName()+" with the value of : "+cache.values().iterator().next());
		cache.keySet().iterator().next().interrupt();
	}

}
