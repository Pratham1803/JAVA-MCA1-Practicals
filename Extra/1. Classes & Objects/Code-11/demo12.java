/*Method accepting object as a Parameter */
class box
{
	int  width,height,length;
	
	box(int w,int h,int l)
	{
		width=w;
		height=h;
		length=l;
	}
}

class first
{
	void add(box b1,box b2)
	{
		System.out.println("Summation of Object: "+ (b1.width + b2.width) + " " +(b1.length + b2.length) + " " + (b1.height + b2.height));
		
	}
}
class demo12
{
	public static void main(String args[])
	{
		
		box b1=new box(10,11,12);
		box b2=new box(13,14,15);
		first f=new first();
		f.add(b1,b2);
	}
}
