//program to demonstrate the concept of multitasking

import java.lang.*;

class Demo extends Thread
{
     String str;
     Demo(String str)
	 {
        this.str = str;
	 }
     public void run()       //run method must be in public section otherwise compiler generate error
	 {
          for(int i = 0; i <= 10; i++)
		  {
			  System.out.println("value of i"+i);
		  }
	 }		 
}

class Thread_Multitasking
{
   public static void main(String args[])
   {
            Demo d1 = new Demo("First Thread");
			Demo d2 = new Demo("Second Thread");
			
			Thread t1 = new Thread(d1);
			Thread t2 = new Thread(d2);
			
			t1.start();
			t2.start();
   }
}

/*

output 

value of i0
value of i1
value of i2          //we cant predict which Thread when will be call
value of i0
value of i3
value of i1
value of i2
value of i4
value of i3
value of i5
value of i6
value of i4
value of i7
value of i5
value of i6
value of i8
value of i7
value of i9
value of i10
value of i8
value of i9
value of i10

*/