//program to demonstrate the concept of Runnable interface

class Demo implements Runnable
{
    public void run()
	{
		System.out.println("Thread started..");
	}
}
class Thread_Interface
{
   public static void main(String args[])
   {
     Demo d  = new Demo();
	 
	 Thread t = new Thread(d);
	 
	 t.start();
   }
}

//output : Thread started..