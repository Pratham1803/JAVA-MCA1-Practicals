/*Practical implementation of DMD */
class Figure
{
	double dim1,dim2;
	Figure(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	Figure(double d1)
	{
		dim1=d1;
		
	}
	void area()
	{
		System.out.println("This is area");
	}
}
class  Rectangle extends Figure
{
	Rectangle(double width,double length)
	{
		super(width,length);
	}
	void area()
	{
		System.out.println("Area of Rectangle="+dim1*dim2);
	}
		
}
class Triangle extends Figure
{
	Triangle(double base,double height)
	{
		super(base,height);
	}
	void area()
	{
		System.out.println("Area of Triangle="+0.5*dim1*dim2);
	}
}
class Circle extends Figure
{	
	Circle(double radius)
	{
		super(radius);
	}
	void area()
	{
		System.out.println("Area of Circle="+3.14*dim1*dim1);
	}
}
class Myclass
{
	void Myarea(Figure f)
	{
		f.area();
	}
}

class demo12
{
	public static void main(String args[])
	{
		Figure f= new Figure(10,10);
		Rectangle r= new Rectangle(10,10);
		Triangle  t= new Triangle(10,10);
		Circle c  = new Circle(10);
		Myclass m = new Myclass();
		m.Myarea(f);
		m.Myarea(r);
		m.Myarea(t);	
		m.Myarea(c);
	}
}
		
		
		


