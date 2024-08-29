/* Simple Interface */

interface  MyInter
{
	public abstract void meth1();
	
}
interface  MyInter1
{
	
	void meth2();
}
class Myclass implements MyInter, MyInter1
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

class demo14
{
	public static void main(String args[])
	{
		Myclass m=new Myclass();
		m.meth1();
		m.meth2();
	}
}