//program to demonstrate the concept of sleep method of Thread class

import java.lang.*;

class Demo extends Thread
{
  public void run()
  {
      for(int i = 1; i <= 5;i++)
	  {
		  System.out.println(i);
		  try
		  {
			  Thread.sleep(1000);
		  }
		  catch(Exception ref)
		  {
			  
		  }
	  }
  }	  
}

class Thread_sleepMethod
{
  public static void main(String args[])
  {
       Demo d1 = new Demo();
	   Thread t1 = new Thread(d1);
	   Demo d2 = new Demo();
	   Thread t2 = new Thread(d2);
	   
	   t1.start();
	   t2.start();
  }
}

/*
output
1            //output display after specific time
1
2
2
3
3
4
4
5
5

*/