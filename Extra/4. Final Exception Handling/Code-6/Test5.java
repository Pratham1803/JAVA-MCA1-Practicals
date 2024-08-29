
//throw 

class Test5
{

	public static void main(String args[])
	{
		try
		{
			ArithmeticException ae =new ArithmeticException("Can't divide by zero");
			throw ae;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("After Catch");	
	}
}
