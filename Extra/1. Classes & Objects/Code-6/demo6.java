/* Default Constructor*/
class box
{
	double width,height,length;
	box() // default
	{
		width=10;
		height=11;
		length=12;	
	}
	void volume()
	{
		System.out.println("Volume="+width*height*length);
	}
}

class demo6
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.volume();
		box b2=new box();
		b2.volume();
	}
}

	
	