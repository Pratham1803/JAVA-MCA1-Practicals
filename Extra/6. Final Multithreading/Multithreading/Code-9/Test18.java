/*Synchronization */

class first
{ 
	synchronized void  meth(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		
		catch(InterruptedException ie){}
		
		System.out.println("]");
	}
}
class MyThread implements Runnable
{
	Thread t;
	first f;
	String str;
	MyThread(first z,String message)
	{
		f=z;
		str= message;
		t=new Thread(this);
		t.start();
	}

	
	public void run()
	{
		f.meth(str);
	}
}
class Test18
{
	public static void main(String args[])
	{
		first f1=new first(); 
		new MyThread(f1,"Mera");
		new MyThread(f1,"Bharat"); 
		new MyThread(f1,"Mahan");


	}
}