//program to demonstrate the concept of synchronized method

import java.lang.*;

class Demo extends Thread
{
    synchronized void Display()
	{
       for(int i = 0; i <= 10; i++)
	   {
          System.out.println("Thread:" + this.getName()+ ":" + i);
	   }
	}

 public void run()
 {
   Display();
 }
 
}
class Thread_Synchronized_Method
{
  public static void main(String args[])
  {
       Demo d1 = new Demo();
	   Demo d2 = new Demo();
	   
	   Thread t1 = new Thread(d1,"First");
	   Thread t2 = new Thread(d2,"Second");
	   
	   t1.start();
	   t2.start();
  }
}

/*output

Thread:Thread-0:0
Thread:Thread-0:1
Thread:Thread-1:0
Thread:Thread-1:1
Thread:Thread-0:2
Thread:Thread-0:3
Thread:Thread-1:2
Thread:Thread-0:4
Thread:Thread-0:5
Thread:Thread-1:3
Thread:Thread-0:6
Thread:Thread-0:7
Thread:Thread-0:8
Thread:Thread-0:9
Thread:Thread-0:10
Thread:Thread-1:4
Thread:Thread-1:5
Thread:Thread-1:6
Thread:Thread-1:7
Thread:Thread-1:8
Thread:Thread-1:9
Thread:Thread-1:10

*/