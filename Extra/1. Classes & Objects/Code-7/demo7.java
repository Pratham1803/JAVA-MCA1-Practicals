/*Parameterized Costructor */
class box
{
	double width,height,length;
	
	box()
	{
		width=w;
		height=h;
		length=l;
	}
	box(double w)
	{
                this();
		width=height=length=w;
		
	}	
	box(double w,double h)
	{
		width=w;
		height=lenght=h=l;
		
	}
	box(double w,double h,double l)
	{
		width=w;
		height=h;
		length=l;
	}
	void volume()
	{
		System.out.println("Volume="+width*height*length);
	}
}
class demo7
{
	public static void main(String args[])
	{
		box b=new box();
		box b1=new box(10,11,21);
		b1.volume();
		box b2=new box(20,20,20);
		b2.volume();
	}
}
	
