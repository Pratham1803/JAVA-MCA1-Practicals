// Interthread Communication with wait() and notify()
// ctrl+c to stop the loop
class First
{
	int i;
	boolean b=false;
	synchronized void put(int num)
	{
		if(b)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie) { }
		}
		
		i= num;
		System.out.println("Put"+i);
		b=true;
		notify();
	}
	synchronized int get()
	{
		
		if(!b)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie) { }
		}

		System.out.println("Get"+i);
		b=false;
		notify();
		return i;
	}
}

class Putter implements Runnable
{
	Thread t;
	First F;
	Putter(First z)
	{
		F=z;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		int k=0;
		while(true)
		F.put(++k);	
	}
}


class  Getter implements Runnable
{
	Thread t;
	First F;
	Getter(First z)
	{
		F=z;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		F.get();
	}
}


class Test20
{
	public static void main(String s[])
	{
		First F1=new First();
		new Putter(F1);
		new Getter(F1);
	}
}
		 		

