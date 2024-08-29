/*Method accepting Parameter */
class first
{
	int square(int num)
	{
		//System.out.println("Squre="+num*num);
		return num*num;
	}
	
}
class demo3
{
	public static void main(String args[])
	{
		first F=new first();
              int  a= F.square(10); // Normal
		F.square(Integer.parseInt(args[0]));

	}
}
