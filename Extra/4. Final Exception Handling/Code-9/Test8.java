class first
{
	void meth1()
	{
		System.out.println("Inside meth1()");
	
		try
		{
			int m=100,n=0;
			int k=m/n;
		}
		finally
		{
			System.out.println("Finally for meth1()");
		}
	}
	void meth2()
	{
		
		System.out.println("Inside meth2()");
	
		try
		{
			return;
		}
		finally
		{
			System.out.println("Finally for meth2()");
		}
	}
}

class Test8
{
	public static void main(String args[])
	{
		first f=new first();
		try
		{
			f.meth1();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("caught for meth1()");
		}
		f.meth2();
	}
}
