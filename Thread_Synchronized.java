//program to demonstrate the concept of Thread Synchronization

import java.lang.*;

class Demo implements Runnable
{
   public void run()
   {
	   synchronized(this)
	   {
		   System.out.println("Thread started...");
	   }
   }
}

class Thread_Synchronized
{
   public static void main(String args[])
   {
       Demo d = new Demo();
	   
	   Thread t = new Thread(d);
	   
	   t.start();
   }
}

//output:  Thread started...