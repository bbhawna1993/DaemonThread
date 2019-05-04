package com.io.daemon;

public class DemoDaemon {

	public static void main(String[] args)
	{
		//Check if the current thread is daemon or not.
		System.out.println(Thread.currentThread().isDaemon());
	}

}
