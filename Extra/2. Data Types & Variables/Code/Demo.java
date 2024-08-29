/*1.Assigning object reference variable */

class box
{
	double width,height,length;
}
class Demo
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.width=10;
		b1.height=11;
		b1.length=12;
		box b2=b1;
		System.out.println("Volume Using Instance Variable :="+b1.width*b1.height*b1.length);
		System.out.println("Volume Using Reference Variable :="+b2.width*b2.height*b2.length);
		b1.width=20;
		System.out.println("Width Using Reference: " +b2.width);
	}
}
