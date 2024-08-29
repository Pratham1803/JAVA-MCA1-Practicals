/*How the constructors are called in mutilevel heirarchy */
class first
{
	first()
	{
		System.out.println("Constructor of first Class");
	}
}
class second extends first
{
	second()
	{
		System.out.println("Constructor of second Class");
	}
}
class third extends second
{
	third()
	{
		System.out.println("Constructor of third Class");
	}
}
class Demo6
{
	public static void main(String args[])
	{
		new third();
	}
}