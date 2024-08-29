/*Method returning object as a Parameter */
class box
{
	int width,height,length;
	box(int w,int h,int l)
	{
		width=w;
		height=h;
		length=l;
	}
	box()
	{
	}
}

class first
{
	box add(box b1,box b2)
	{
		
		box b=new box();
		b.width=(b1.width + b2.width);
		b.height=(b1.height + b2.height);
		b.length=(b1.length + b2.length);
		return b;
	}
}
class demo13
{
	public static void main(String args[])
	{
		
		box b1=new box(10,11,12);
		box b2=new box(13,14,15);
		first f=new first();
		box b=f.add(b1,b2);
		System.out.print("Summation = "+ b.width +" " + b.height + " " + b.length);
	}
}
