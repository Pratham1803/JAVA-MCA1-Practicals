/*ASynchronization */

class first
{
	void  meth(String msg)
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
	//first f;
	first f=new first();
	String str;
	/*MyThread(first z,String message)
	{
		f=z;
		str= message;
		t=new Thread(this);
		t.start();
	}*/

	MyThread(String message)
	{
	
		str= message;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		f.meth(str);
	}
}
class Test17
{
	public static void main(String args[])
	{
		//first f1=new first(); 
		/*new MyThread(f1,"Mera");
		newMyThread(f1,"Bharat"); 
		newMyThread(f1,"Mahan");*/

		new MyThread("Mera");
		new MyThread("Bharat"); 
		new MyThread("Mahan");


	}
}
