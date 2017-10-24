package com.test.controlling.group.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ControlGroupTasks {
	
	public static void main(String[] args) {
		
		
		ExecutorService service = Executors.newFixedThreadPool(30);
		
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(10));
        tasks.add(new Task(20));
        tasks.add(new Task(30));
        tasks.add(new Task(40));
        tasks.add(new Task(50));
        tasks.add(new Task(60));
        tasks.add(new Task(70));
        tasks.add(new Task(80));
        tasks.add(new Task(90));
        
        ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(service);
        
        
        for(Task t : tasks){
        completionService.submit(t);
        Future<Integer> outcome=null;
		try {
			outcome = completionService.take();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(outcome);
        }
        
        
                
		
		/*
		try {
			//Integer retVal = service.invokeAny(tasks);
			//System.out.println("ReturnedVal : "+retVal);
			 List<Future<Integer>> futureObjects= service.invokeAll(tasks);
			 
			 System.out.println(futureObjects.size());			
			service.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
