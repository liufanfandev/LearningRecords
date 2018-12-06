package com.my.thinking.concurrent;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable{

	@Override
	public void run() {
		try {
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("sleep() interrupted" );
		}
	}
	
	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 10; i++) {
			Thread deamon = new Thread(new SimpleDeamons());
			deamon.setDaemon(true);
			deamon.start();
		}
		System.out.println("All deamons start");
		TimeUnit.MILLISECONDS.sleep(775);
	}

}
