//program to demonstrate the concept of Thread class

class Demo extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Value of i"+i);
		}
	}
	
}

class Thread_Class
{
   public static void main(String args[])
   {
      Demo d = new Demo();
	  
	  Thread t = new Thread(d);
	  
	  t.start();
   }
}

/*
output 

Value of i0
Value of i1
Value of i2
Value of i3
Value of i4
Value of i5
Value of i6
Value of i7
Value of i8
Value of i9
Value of i10

*/