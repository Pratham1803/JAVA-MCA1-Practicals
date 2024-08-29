/*Practical implementation of DMD */
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
}
class third extends first
{
	void meth()
	{
		System.out.println("Meth defined in third class");
	}
}
class fourth extends first
{
	void meth()
	{
		System.out.println("Meth defined in fourth class");
	}
}
/*
class Myclass
{
	void Mymeth(first f)
	{
		f.meth();
	}
}
*/

class demo11
{
	public static void main(String args[])
	{
		first f=new first();
		second s=new second();
		third  t=new third();
		fourth fr=new fourth();
		Myclass m=new Myclass();
		m.Mymeth(f);
		m.Mymeth(s);
		m.Mymeth(t);	
		m.Mymeth(fr);
	}
}
		
		
		


