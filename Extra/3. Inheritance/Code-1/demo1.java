/*simple Inheritance */
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
		System.out.println("A="+a+ " and " +"B="+b);
	}
	
}

class demo1
{
	public static void main(String args[])
	{
		second s=new second();
		s.a=100;
		s.b=200;
		s.showa();
		s.showab();
	}
}