/* Ctrating our own Thread */

class Threadlogic implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){ }
		}
	}
}

class MyThread // creation of Thread class or object of Thread class
{
	Thread t;
	void createThread()
	{
		Threadlogic TL=new  Threadlogic();
		t=new Thread(TL);
	}
	void beginThread()// Starting of Thread 
	{
		t.start();
	}
}
class Test11
{	
	public static void main(String args[])
	{
		MyThread m=new MyThread();// m is not child thread 
		m.createThread();
		m.beginThread(); // m.t.createThread(), m.t is child thread
	}
}