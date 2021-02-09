//program to demonstrate the concept of main method also consider as Thread

import java.lang.*;

class Thread_MainMethod
{
  public static void main(String args[])
  {
    System.out.println(Thread.currentThread().getName());      //main
	System.out.println(Thread.currentThread().getId());        //1
	System.out.println(Thread.currentThread().getPriority()); //default priority of Thread is 5
  }
}

/*
main
1
5
*/