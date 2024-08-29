
// Describing an exception
class Test
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
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		catch(ArrayIndexOutOfBoundsException  ae)
		{
			System.out.println(ae);
		}
		catch(Exception  e)//D.M.D  
		{
			System.out.println(e);
		}
		System.out.println("After Catch");
	}
}

