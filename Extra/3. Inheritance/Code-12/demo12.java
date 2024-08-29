/* Abstract class */
abstract class first
{
	int a,b;
	first(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	abstract void meth1();
	abstract void meth2();
	void meth3()
	{
		System.out.println("This is meth3");
	}
}
class Second extends first
{
	Second(int m,int n)
	{
		super(m,n);
	}
	void meth1()
	{
		System.out.println("This is meth1.a="+a);
	}
	void meth2()
	{
		System.out.println("This is meth2.b="+b);
	}
}
class demo12
{
	public static void main(String args[])
	{
		Second s=new Second(10,20);
		s.meth1();
		s.meth2();
		s.meth3();
	}
}