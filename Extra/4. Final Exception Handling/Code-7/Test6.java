
class Test6	
{
	public static void main(String args[])
	{
		F f=new F();
		try
		{
			f.meth(Integer.parseInt(args[0]));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught Ultimately");
		}
	}
}	

