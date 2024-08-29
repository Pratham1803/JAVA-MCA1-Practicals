/*Method overloading */

class Test
{
	void meth(String str)
	{
		System.out.println("String Args");
	}
	void meth(Object ob)
	{
		
		System.out.println("Object Args");
	}
	
}
class Demo1
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.meth(new Object()); 
		t.meth("KKPK"); 
		t.meth(null);
	}
}