/*Multilevel heirarchy of Inheritance */
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
class third extends second
{
	int c;
	void showabc()
	{
		System.out.println("A="+a+" and "+"B="+b+" and "+"C="+c);
	}
}
class Demo5
{
	public static void main(String args[])
	{
		third t=new third();
		t.a=100;
		t.b=200;
		t.c=300;
		t.showa();
		t.showab();
		t.showabc();
		
	}
}