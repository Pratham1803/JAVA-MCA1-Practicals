class Test3
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Outer try starts");
			try
			{
				System.out.println("Inner try starts");
				int m=100;
				int n=Integer.parseInt(args[0]);
				int k=m/n;
				System.out.println("k="+k);
				System.out.println("Inner try Ends");
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Can't divide by zero");
			}
		System.out.println("Outer try Ends");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid ArrayIndex");
		}
		System.out.println("After Catch");
	}
}
	
