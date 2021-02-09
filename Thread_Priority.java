//program to demonstrate the concept of Thread Priority
/*
methods

setName()
getName()
setPriority()
getPriority()
*/

import java.lang.*;

class Demo extends Thread
{
	public void run()
	{
		System.out.println("Thread name \t" + Thread.currentThread().getName());
		System.out.println("Thread priority \t" + Thread.currentThread().getPriority());
	}
}
class Thread_Priority
{
   public static void main(String args[])
   {
       Demo d1 = new Demo();
	   
	   Thread t1 = new Thread(d1,"First");
	   Thread t2 = new Thread(d1);
	   
	   
	   t2.setName("Second");
	   t1.setPriority(3);                   //using nmeric value
	   t1.setPriority(Thread.NORM_PRIORITY);
	   
	   t1.start();
	   t2.start();
   }
}

/*
output

Thread name     First
Thread name     Second
Thread priority         5
Thread priority         5

*/