/* Extending Thread */

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName()+" : " + i);
			try
			{
				sleep(1000);
				
			}
			catch(InterruptedException ie){}
		}
	}
}

class Test13
{
	public static void main(String args[])
	{
		MyThread m=new MyThread();
		m.setName("One");
		m.start();			
	}
}
			

	