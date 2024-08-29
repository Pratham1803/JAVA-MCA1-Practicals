// Thread Priority
class MyThread implements Runnable
{
	Thread t;
	long  cnt=0;
	boolean b=true;
	MyThread(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
		t.start();
	}
	public void run()
	{
		while(b)
		cnt++;
	}
	
}
class Test16
{
	public static void main(String args[])
	{
		MyThread m1=new MyThread(7);
		MyThread m2=new MyThread(4);
		m1.t.setName("One");
		m2.t.setName("Two");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}
		m1.b=false;
		m2.b=false;
		System.out.println("Count of Thread-1:"+m1.cnt);
		System.out.println("Count of Thread-2:"+m2.cnt);
		
		System.out.println("**************************");

		System.out.println("Priority of Thread-1:"+m1.t.getPriority());
		System.out.println("Priority of  Thread-2:"+m2.t.getPriority());

		System.out.println("**************************");

		System.out.println("Min Priority of Thread :"+Thread.MIN_PRIORITY);
		System.out.println("Min Priority of Thread :"+Thread.NORM_PRIORITY);
		System.out.println("Max Priority of Thread :"+Thread.MAX_PRIORITY);
		System.exit(0);
		
	}
}