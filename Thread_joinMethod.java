//program to demonstrate the concept of Thread join method 

import java.lang.*;

class Demo extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 5; i++)
		{
			System.out.println(i);
		}
	}
}
class Thread_joinMethod
{
  public static void main(String args[])
  {
      Demo d = new Demo();
	  
	  Thread t1 = new Thread(d,"First");
	  Thread t2 = new Thread(d,"Second");
	  
	  t1.start();
	  
	  try
	  {
		  t1.join();
	  }
	  catch(Exception ref)
	  {
		  t2.start();
	  }
  }
}

/*
output
0
1
2
3
4
5
*/