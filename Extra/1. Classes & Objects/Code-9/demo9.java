/*Constructer overloading */
class box
{
	double width,height,length;
	
	box(double side)
	{
		width=height=length=side;
	}
	box(double l, double h)
	{
		length=l;
		width=height= h;
	}
	box(double w,double h,double l)
	{
		width=w;
		height=h;
		length=l;
	}
	
	void volume()
	{
		System.out.println("volume="+width*height*length);
	}
}
class demo9

{
	public static void main(String args[])
	{
		box b1=new box(10);
		b1.volume();
		box b2=new box(10,20);
		b2.volume();
		box b3=new box(10,20,30);
		b3.volume();
	}
}