/* Interface Using D.M.D */

interface MyInter
{
	public abstract void meth();
}

class Myclass1 implements MyInter
{
	public void meth()
	{
		System.out.println("Meth defined in Myclass1");
	}
}
class Myclass2 implements MyInter
{
	public void meth()
	{
		System.out.println("Meth defined in Myclass2");
	}
}

class ourClass
{
	void ourMeth(MyInter m)
	{
		m.meth();
	}
}
class demo15
{
	public static void main(String args[])
	{
		Myclass1 m1=new Myclass1();
		Myclass2 m2=new Myclass2();
		ourClass O=new ourClass();
		O.ourMeth(m1);
		O.ourMeth(m2);
	}
}

