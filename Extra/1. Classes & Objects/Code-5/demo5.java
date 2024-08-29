/*Use of this keyword */
class box
{
	double width,height,length;
	void assign(double width,double height,double length)
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
class demo5
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.assign(10,11,12);
		b1.volume();
		
	}
}