/* Control of the program can not be  passed to the thread */

class MyThread implements Runnable
{
	Thread t;
	MyThread()
	{
		t=new Thread(this);
		t.start();	
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child:"+i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ie){ }
		}
	}
}

class Test12
{
	public static void main(String args[])
	{
		MyThread m= new MyThread();
		System.out.println("Count"+Thread.activeCount());
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){ }
		}
		
	}
		
}