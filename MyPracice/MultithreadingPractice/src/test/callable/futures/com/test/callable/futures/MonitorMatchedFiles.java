package com.test.callable.futures;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MonitorMatchedFiles implements Callable<Integer> {
	
	
	private String rootDir;
	
	private String searchString;
	
	public MonitorMatchedFiles(String rootDir,String searchString) {
		
		this.rootDir = rootDir;
		this.searchString=searchString;
	
	}
	

	@Override
	public Integer call() throws Exception {

         return findMatchedFilesCount();
			
		
	}
	
	private int findMatchedFilesCount(){
		
		File f = new File(rootDir);
		
		int count=0;
		
		List<FutureTask>tasks = new ArrayList<FutureTask>();
		
		for(File sub : f.listFiles()){
					
			if(sub.isDirectory()){
				
				MonitorMatchedFiles monitorMatchedFiles= new MonitorMatchedFiles(sub.getPath(),searchString);
				
				FutureTask<Integer> task = new FutureTask<Integer>(monitorMatchedFiles);
				
				tasks.add(task);
				
				Thread t = new Thread(task);
				
				t.start();
				
			} else if(sub.getName().startsWith(searchString)){
				
				count++;
				
			}
			
		}
		
		for(FutureTask<Integer>task :tasks){
			
			try {
				count += task.get();
				
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return count;
		
		
	}


	
	

}
