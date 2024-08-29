/*The object reference variable of super class can refer 
the object of sub class but it only refer to those members 
that are inherited from the super class */
class first
{
	int a;
	void showa()
	{
		System.out.println("A="+a);
	}
}
class second extends first
{
	int b;
	void showab()
	{
		System.out.println("A="+a+" and "+"B="+b);
	}
}

class demo2
{
	public static void main(String args[])
	{
		first f=new second();
		f.a=100;
		f.showa();
		//f.b=200;
		//f.showab();
	}
}