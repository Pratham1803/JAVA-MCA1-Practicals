/* variables in an Interface */

interface MyInter
{
	int a=100;
}

class  Myclass implements MyInter
{
	
}

class demo18
{
	public static void main(String args[])
	{
		Sysyem.out.println(Myclass.a);
		Sysyem.out.println(MyInter.a);
		Myclass a=200;
	}

}