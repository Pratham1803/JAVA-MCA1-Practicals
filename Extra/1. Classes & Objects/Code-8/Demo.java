/*Method overloading */

class Test
{
	void meth(int i)
	{
		System.out.println("Integer Args");
	}
	void meth(float f)
	{
		
		System.out.println("Float Args");
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.meth(10); 
		t.meth(10.5f);
		t.meth('a');
		t.meth(10l);
		t.meth(10.5);
	}
}









