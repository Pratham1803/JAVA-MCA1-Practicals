/* DMD Using abstract class */
abstract class first
{
	abstract void meth();
}
class Second extends first
{
	
	void meth()
	{
		System.out.println("This is meth defined in second class");
	}
}

class third extends first
{
	void meth()
	{
		System.out.println("This is meth defined in third class");
	}
}
class Myclass
{
	void Mymeth(first f)
	{

		f.meth();
	}
}
class demo13
{
	public static void main(String args[])
	{
		Second s=new Second();
		third  t=new third();
		Myclass m= new Myclass();	
		m.Mymeth(s);
		m.Mymeth(t);
	}
}		
