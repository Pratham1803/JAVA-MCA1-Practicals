/*staic variable */
class first
{
	static int a=100;
	int b;	
	static void meth()
	{
		System.out.println("This is static method");
	}
	static
	{
		System.out.println("This is static block");
	}
}
class demo13
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		System.out.println(first.a);
		first.meth();
		first f1=new first();
		first f2=new first();
		System.out.println(f1.a);
		System.out.println(f2.a);
		f1.a=200;
		System.out.println(f2.a);
		System.out.println(first.a);
		f1.meth();
		f2.meth();
	}
}
		
		