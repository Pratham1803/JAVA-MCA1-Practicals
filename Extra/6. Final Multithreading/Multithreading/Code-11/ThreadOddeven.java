class EvenThread implements Runnable
{
  	Thread t;

  	EvenThread(String tname)
   	{
     		t=new Thread(this,tname);
     		t.start();
   	}

  	public void run()
   	{
     		for(int num=1; num<=20; num++)     
      		{
        		if((num%2)==0)
            		System.out.println(t.getName() + ": " + num);
     		 }
   	}
}


class OddThread implements Runnable
{
  	Thread t;

  	OddThread(String tname)
   	{
    		 t=new Thread(this,tname);
    		 t.start();
   	}

  	public void run()
   	{
     		for(int num=1; num<=20; num++)     
      		{
        		if((num%2)!=0)
            		System.out.println(t.getName() + ": " + num);
      		}
   	}
}

class ThreadOddeven
{
  	public static void main(String args[ ])
   	{
    		 EvenThread t1=new EvenThread("One");
     		OddThread t2=new OddThread("Two");
   	}
}

