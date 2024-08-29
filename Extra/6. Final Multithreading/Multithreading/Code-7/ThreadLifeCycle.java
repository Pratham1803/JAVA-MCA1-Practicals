class ThreadDemo extends Thread 
{
   	Thread t;
   	String tName;
   
   	ThreadDemo( String name)
	{
      	 	tName = name;
       		System.out.println("Creating Thread: " +  tName );
   	}
   	public void run() 
	{

      		try 
		{
			for(int i = 1; i <= 5; i++) 
			{
            			System.out.println("Thread Running: " +  tName );
				System.out.println("Thread: " + tName + ", " + i);
            	
            			Thread.sleep(2000);
         		}
     		} 
		catch (InterruptedException e) 
		{
         		System.out.println("Thread " +  tName + " Interrupted.");
     		}
     		System.out.println("Natural Death:"+tName);
   	}
   
   	public void start ()
   	{
      		System.out.println("Starting Thread: " +  tName );
      		if (t == null)
      		{
         		t = new Thread (this, tName);
         		t.start ();
      		}
  	 }

}

public class ThreadLifeCycle
{
   	public static void main(String args[]) 
	{
   
      		ThreadDemo T1 = new ThreadDemo( "Thread-1");
      		T1.start();
      
      		ThreadDemo T2 = new ThreadDemo( "Thread-2");
      		T2.start();
   	}   
}