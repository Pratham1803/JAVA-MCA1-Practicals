class MyException extends RuntimeException
{
	public String toString()
	{
		return"Value greater than 100 not allowed";
	}
}
class first
{
	void square(int num) throws MyException
	{
		if(num>100)
		{
			MyException m=new MyException();
			throw m;
		}
		System.out.println("Square ="+num*num);
	}
}
class Test9
{
	public static void main(String args[])
	{
		first f=new first();
		try
		{
			f.square(120);
		}
		catch(MyException m)
		{
			System.out.println(m);
		}
	}
}

