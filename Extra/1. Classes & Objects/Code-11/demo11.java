/*Method accepting object as a Parameter */
class box
{
	double width,height,length;
	box(double w,double h,double l)
	{
		width=w;
		height=h;
		length=l;
	}
}

class first
{
	void volume(box b)
	{
		System.out.println("Volume="+b.width*b.height*b.length);
	}
}
class demo11
{
	public static void main(String args[])
	{
		box b1=new box(10,11,12);
		first f=new first();
		f.volume(b1);
	}
}
