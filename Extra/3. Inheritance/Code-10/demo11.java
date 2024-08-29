/*Method overriding */
class first
{
	void meth()
	{
		System.out.println("Meth defined in first class");
	}

}

class second extends first
{
	void meth()
	{
		System.out.println("Meth defined in second class");
	}
	
	void access()
	{
		super.meth();
	}
}

class demo11
{
	public static void main(String args[])
	{
		second s=new second();
		s.meth();
		s.access();
	}
	
}