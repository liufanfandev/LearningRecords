package thinking.concurrent;

public class SimplePriorities implements Runnable{
	private int countDown = 5;
	private volatile double d;
	private int priority;
	public SimplePriorities(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return Thread.currentThread()+":"+countDown;
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while(true){
			
		}
	}

}
