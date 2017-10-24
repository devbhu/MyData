package com.test.download.manager;


public class Task implements Runnable{
	
	private String taskName ;
	private int taskSize;
	public int getProgress() {
		return progress;
	}

	private volatile int progress;
	
	public String getTaskName() {
		return taskName;
	}

	public int getTaskSize() {
		return taskSize;
	}

	public Task(String taskName, int taskSize) {
		super();
		this.taskName = taskName;
		this.taskSize = taskSize;
	}


	public Integer call() throws Exception {
		 
		
		return progress;
	}

	@Override
	public void run() {
         if(this.getProgress()<=this.getTaskSize() ){
        	 System.out.println("The download progress of task "+taskName+ " : "+progress+ " MB downloaded " + " total task size  : "+taskSize);
        	 progress= progress+DownloadService.PER_SECOND_DOWNLOAD_SPEED;
        	 
		}	 
		
	}
}
