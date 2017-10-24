package lifecycle.callbacks;

import org.springframework.context.Phased;
import org.springframework.context.SmartLifecycle;

public class PhaseLifeCycle implements SmartLifecycle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		
		System.out.println(" Smart lifecycle stop called !!!");
		
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean isAutoStartup() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println(" Smart lifecycle stop callback called !!!");
	   	callback.run();
	}

 

}
