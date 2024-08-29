// Printing 1-5 and 15-1

class MyThread1 implements Runnable
{
  	Thread t;

	MyThread1(String tname)
   	{
     		t=new Thread(this,tname);
		t.start();
   	}

	public void run()
   	{
		for(int i=1; i<=15; i++)
      		{
			System.out.println(t.getName() + ": " + i);

			try
          		{
				Thread.sleep(1000);
          		}
			catch(InterruptedExceptionie){}
      		}
   	}
}

class MyThread2 implements Runnable
{
  	Thread t;

	MyThread2(String tname)
   	{
     		t=new Thread(this,tname);
		t.start();
   	}

	public void run()
   	{
		for(int i=15; i>=1; i--)
      		{
			System.out.println(t.getName() + ": " + i);

			try
          		{
				Thread.sleep(1000);
          		}
			catch(InterruptedExceptionie){}
      		}
   	}
}

class Test21
{
	public static void main(String args[ ])
   	{
		new MyThread1("One");
		new MyThread2("Two");
   	}	
}




