class box
{
	double width,height,length;
}
class demo1
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.width=10;
		b1.height=11;
		b1.length=12;
		System.out.println("Volume ="+b1.width*b1.height*b1.length);
		
	
	}
}