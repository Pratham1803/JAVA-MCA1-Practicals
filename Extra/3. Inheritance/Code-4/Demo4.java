/*Using 'super' to refer the members inherited from super class */
class first
{
	int a=100;
}
class second extends first
{
	int a=200;
	void access()
	{
		System.out.println(super.a);
	}
}
class Demo4
{
	public static void main(String args[])
	{
		second s=new second();
		System.out.println(s.a);
		s.access();
	}
}