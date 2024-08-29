/*Constructer overloading */

class Test
{
	Test()
	{
		this(10);
		System.out.println("No Args");
	}
	Test(int i)
	{
		this(10.5);
		System.out.println("Integer Args");
	}
	Test(double d)
	{
		
		System.out.println("Double Args");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test(10);
		Test t3=new Test(10.5);
		Test t4=new Test(10l);
	}
}