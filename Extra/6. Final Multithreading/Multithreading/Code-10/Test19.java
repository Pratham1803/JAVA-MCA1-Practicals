class First
{
	int i;
	synchronized void put(int num)
	{
		i= num;
		System.out.println("Put"+i);
	}
	synchronized int get()
	{
		System.out.println("Get"+i);
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


class Test19
{
	public static void main(String s[])
	{
		First F1=new First();
		new Putter(F1);
		new Getter(F1);
	}
}
