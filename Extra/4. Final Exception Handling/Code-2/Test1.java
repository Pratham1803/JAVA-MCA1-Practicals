
class Test1
{
	public static void main(String args[])
	{
		try                         
		{
			int m=100,n=Integer.parseInt(args[0]);
			int k=m/n;
			System.out.println("K="+k);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Can't divide by zero");
		}
		System.out.println("After catch");
	}
}

