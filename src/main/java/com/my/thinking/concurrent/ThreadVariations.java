package com.my.thinking.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadVariations {

}
class InnerThread1{
	private int countDown = 5;
	private Inner inner;
	public InnerThread1(String name) {
		inner = new Inner(name);
	}
	private class Inner extends Thread{
		Inner(String name) {
			super(name);
			start();
		}
		public void run(){
			try {
				while(true){
					System.out.println(this);
					if(--countDown == 0) return;
					sleep(10);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Interrupted");
			}
		}
		@Override
		public String toString() {
			return getName()+":"+countDown;
		}
	}
}

class InnerThread2{
	private int countDown = 5;
	private Thread t;
	public InnerThread2(String name) {
		t = new Thread(name){
			public void run(){
				while(true){
					System.out.println(this);
					try {
						while(true){
							System.out.println(this);
							if(--countDown == 0) return;
							sleep(10);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("sleep() Interrupted");
					}
				}
			}
			public String toString() {
				return getName()+":"+countDown;
			}
		};
		t.start();
	}
	
}
class InnerRunnable1{
	private int countDown = 5;
	private Inner inner;
	public InnerRunnable1(String name) {
		inner = new Inner(name);
	}
	private class Inner implements Runnable{
		Thread t;
		public Inner(String name) {
			t = new Thread(this,name);
			t.start();
		}
		@Override
		public void run() {
			while(true){
				System.out.println(this);
				try {
					while(true){
						System.out.println(this);
						if(--countDown == 0) return;
						TimeUnit.MILLISECONDS.sleep(10);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("sleep() Interrupted");
				}
			}
		}
		@Override
		public String toString() {
			return t.getName()+":"+countDown;
		}
		
	}
	
}
/*class InnerRunnable2{
	private int countDown = 5;
	@Override
	public String toString() {
		return getName()+":"+countDown;
	}
}
class ThreadMethod{
	private int countDown = 5;
	@Override
	public String toString() {
		return getName()+":"+countDown;
	}
}*/






