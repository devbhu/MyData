package com.test.download.manager;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class DownloadManager {
	
	private final DownloadService service = new DownloadService();
	
	private final AtomicInteger totalDownloadProgress = new AtomicInteger(0);
	
	private final AtomicInteger totalTaskCompletion = new AtomicInteger(0);

	public DownloadManager(){
		System.out.println("Download manager initialized!!!");	
	}
	
	public final void getDownLoadProgress(Task task){
		totalTaskCompletion.incrementAndGet();
		 int val =-1;
		 service.showProgress(task);
		 try {
			while(task.getProgress()<=task.getTaskSize()){ 
				int dwn = task.getProgress();
			    if(val!=dwn){
			    val = dwn;
				totalDownloadProgress.addAndGet(val);
			    }
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			totalTaskCompletion.decrementAndGet();
		}
		 
		 totalTaskCompletion.decrementAndGet();
	}
	
	public final int getTotalDownloadProgress(){
        
		return totalDownloadProgress.get();
		
	}

	public AtomicInteger getTotalTaskCompletion() {
		return totalTaskCompletion;
	}
 	

}
