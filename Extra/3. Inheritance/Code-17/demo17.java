/* Interface can be Extended */

interface MyInter1	
{
	void meth1();
}

interface MyInter2 extends MyInter1	
{
	void meth2();
}
class Myclass implements MyInter2
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

class demo17
{
	public static void main(String args[])
	{
		Myclass m=new Myclass();
		m.meth1();
		m.meth2();
	}
}