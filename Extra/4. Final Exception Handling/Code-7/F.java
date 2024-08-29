
class F	
{
	void meth(int num)
	{
		try
		{
		   int k=100/num;
		   System.out.println("K = "+k);
		}
 		catch(ArithmeticException e)
		{
			throw e;
		}
	}
}		

