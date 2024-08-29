/* Multiple Inheritance Using Interfaces */

interface MyInter1	
{
	void meth1();
}

interface MyInter2	
{
	void meth2();
}
class Myclass implements MyInter1,MyInter2
{
	public void meth1()
	{
		System.out.println("Meth1 defined in Myclass");
	}
	public void meth2()
	{
		System.out.println("Meth2 defined in Myclass");
	}
}

class demo16
{
	public static void main(String args[])
	{
		Myclass m=new Myclass();
		m.meth1();
		m.meth2();
		MyInter1 m1=m;
		m1.meth1();
		//m1.meth2();

		MyInter2 m2=m;
		// m2.meth1();
		m2.meth2();
	}
}