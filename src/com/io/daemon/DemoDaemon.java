package com.io.daemon;

public class DemoDaemon {

	public static void main(String[] args)
	{
		//Check if the current thread is daemon or not.
		/*Main thread is non daemon.We can't change the daemon nature 
		of main thread because it gets automatically started by JVM.
         after it is started,if we change the daemon nature then it will throw
         IllegalThreadStateException.
		 */
		Mythread t=new Mythread();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		t.start();
		System.out.println("main thread"); 
		//Thus it threw IllegalThreadStateException.
		//Thread.currentThread().setDaemon(true);

	}

}
