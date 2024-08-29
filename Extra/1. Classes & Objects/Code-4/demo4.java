/*Metod returning object */
class First
{
	int square(int num)
	{
		return(num*num);
	}
}
class demo4
{
	public static void main(String args[])
	{
		First F=new First();
		int r=F.square(25);
		System.out.println("Square="+r);
	}
}
