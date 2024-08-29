/*using 'super'to call the constructor of super class*/
	
class box
{
	double width,height,length;
	box(double width,double height,double length)
	{
		this.width=width;
		this.height=height;
		this.length=length;
	}
	void volume()
	{
		System.out.println("Volume="+width*height*length);
	}
}
class newbox extends box
{
	double density;
	newbox(double width,double height,double length,double d)
	{
		super(width,height,length);
		density=d;
	}
	void mass()
	{
		System.out.println("Mass="+width*height*length*density);
	}
}
class Demo3
{
	public static void main(String args[])
	{
		newbox n=new newbox(10,10,10,5);
		n.volume();
		n.mass();
	}
}