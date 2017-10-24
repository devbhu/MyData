package com.test.download.manager;

public class ExternalTask implements Runnable{

	private DownloadManager manager;
	private Task task;
	
	public ExternalTask(DownloadManager manager, Task task) {
		super();
		this.manager = manager;
		this.task = task;
	}

	@Override
	public void run() {
		
		manager.getDownLoadProgress(task);
	}

}
