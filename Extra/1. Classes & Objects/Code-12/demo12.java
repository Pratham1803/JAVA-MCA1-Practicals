/* Method returning object */
class first
{
	void display()
	{
		System.out.println("This is display");
		
	}
}
class second
{
	first meth()
	{
		first f=new first();
		return(f);
	}
}
class demo12
{
	public static void main(String args[])
	{
		second S=new second();
		first f1=S.meth();
		f1.display();
	}
}
		