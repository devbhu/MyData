package com.test.download.manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDownloadManager {
	
	public static void main(String[] args) {
		
		final DownloadManager manager = new DownloadManager();
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<15;i++){
			if(i%2==0)
			service.submit(new ExternalTask(manager, new Task("Task"+i, 10+i)));
			else
			service.submit(new ExternalTask(manager, new Task("Task"+i, 10+i+1)));
		}
		
		
		
		service.shutdown();
		
		
		/*new Thread(){
			
			@Override
			public void run(){
				int val = -1;
				while(manager.getTotalTaskCompletion().get()!=0){
					
					System.out.println("Total downloaded : "+manager.getTotalDownloadProgress());
					
					
					
				}
				
			}
			
		}.start();*/
		
	}

}
