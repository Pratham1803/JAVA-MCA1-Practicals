class first
{
	void meth() throws IllegalAccessException
	{
		try
		{
			IllegalAccessException ie=new IllegalAccessException();
            			throw ie;
		}
		catch( IllegalAccessException ie)
		{
		
			throw ie;
		}
	}
}


class Test7
{
	public static void main(String args[])
	{
		first f=new first();
		try
		{
			f.meth();
		}
		catch(IllegalAccessException ie)
		{
			System.out.println("Exception catch Ultimately");	
		}
	}
}

