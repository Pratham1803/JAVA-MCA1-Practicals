// final method
class first
{
	final void run()
	{
	 	System.out.println("This Run method defined in First Class");
	}
	
}

class second extends first
{
	void run()
	{
	 	System.out.println("This Run method defined in Second Class");
	}

}
class Demo8
{
	public static void main(String args[])
	{
		second s =new second();
		s.run();
	}
}
