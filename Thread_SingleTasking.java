//program to demonstrate the concept of Singletasking

import java.lang.*;

class Demo extends Thread
{
   public void run()
   {
      System.out.println("Thread started...");
	  
	  fun1();
	  fun2();
	  fun3();
   }	   
   
   void fun1()
   {
	   System.out.println("In fun1");
   }
   void fun2()
   {
	   System.out.println("In fun2");
   }
   void fun3()
   {
	   System.out.println("In fun3");
   }
}

class Thread_SingleTasking
{
  public static void main(String args[])
  {
     Demo d  = new Demo();

     Thread t = new Thread(d);
 
     t.start(); 
  }
}

/*output
Thread started...
In fun1
In fun2
In fun3
*/