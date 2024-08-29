/*Adding methods to class */
class box
{
	double width,height,length;
	void volume()
	{
		System.out.println("Volume="+width*height*length);
	}
}
class demo2
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.width=10;
		b1.height=11;
		b1.length=12;
		b1.volume();
	}
}