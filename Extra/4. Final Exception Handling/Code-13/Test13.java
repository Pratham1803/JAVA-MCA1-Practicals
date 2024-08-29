class AgeNotWithinRange extends Exception
{
	AgeNotWithinRange(String msg)
	{
		super(msg);
	}

}

class Driver
{
	int vno,age;
	String name;
	
	Driver(int no,String n,int a)
	{
		vno=no;
		name=n;
		age=a;
	}

	void display() 
	{
		try{
			if(age<18)
				throw new AgeNotWithinRange("Age is less than 18");		
			else	
				System.out.println("Age ="+age);	
		}
		catch(AgeNotWithinRange a)
		{
			System.out.println(a);
		}
		
	}
}

class Test13
{
	public static void main(String arg[])
	{
		Driver d=new Driver(1,"Amar",25);
		d.display();
	}
}