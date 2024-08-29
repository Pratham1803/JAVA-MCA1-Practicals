/* Creating multiple child Threads */
class MyThread implements Runnable
{
	Thread T;
	MyThread(String Tname)
	{
		T=new Thread(this,Tname);
		T.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(T.getName()+":"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class Test14
{
	public static void main(String args[])
	{
		new MyThread("One");	
		new MyThread("Two");
		new MyThread("Three");
	}
}
