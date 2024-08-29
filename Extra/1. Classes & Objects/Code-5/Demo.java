class Box
{
	double width, length, height;
	Box()
	{
		System.out.println("Calling Constructor of Same Class Using this");
	}
	
	Box(double width, double length)
	{
		this();
		this.width=width;
		this.length=length;
	} 

	Box(double width,double length,double height)
	{
		this(width,length);
		this.height=height;
	} 

	void disp()
	{
		System.out.println(width+ " "+ length+ " "+ height);
	}
}

class Demo
{
	public static void main(String s[])
	{
		Box b1= new Box(10,11,12);
		Box b2= new Box(20,20,20);
		b1.disp();
		b2.disp();
	}
}
	




