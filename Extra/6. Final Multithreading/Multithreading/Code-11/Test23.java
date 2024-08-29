// To print the table up from 5 to 20.

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
		for(int i=5;i<=20;i++)
        	{

			for(int j=1; j <= 10; j++)
        		System.out.print(" "+i*j);
			System.out.print("\n");

			try
          		{
				Thread.sleep(1000);
          		}
			catch(InterruptedException ie){}
      		}
   	}
}

class Test23
{
	public static void main(String args[ ])
   	{
		new MyThread1("One");
		
   	}
}
