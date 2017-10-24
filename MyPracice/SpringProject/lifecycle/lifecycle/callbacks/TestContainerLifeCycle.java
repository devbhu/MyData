package lifecycle.callbacks;

import org.springframework.context.Lifecycle;

public class TestContainerLifeCycle implements Lifecycle{

	@Override
	public void start() {
		
		System.out.println("TestContainerLifeCycle started!!!");
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping TestContainerLifeCycle !!");
		
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return true;
	}



}
