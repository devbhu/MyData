package com.test.download.manager;

import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DownloadService {
    
	static final int PER_SECOND_DOWNLOAD_SPEED=2;
	
	private final ScheduledExecutorService schdService = Executors.newScheduledThreadPool(10);
	
	public void showProgress(Task task) {
  
		schdService.scheduleAtFixedRate(task, 2, 1, TimeUnit.SECONDS);
		
		
			
	}

}
