class Test2
{
	public static void main(String args[])
	{
		try
		{
			int m=100;
			int n=Integer.parseInt(args[0]);
			int k=m/n;
			System.out.println("k="+k);
		}
		/*
		catch(ArithmeticException ae)
		{
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Invalid ArrayIndex");
		}
		
		catch(NumberFormatException  e)
		{
			System.out.println("Invalid Number Format");
		}*/
                catch(Exception e)
		{
 				System.out.println(e);
		}
		System.out.println("After Catch");
	}
}

