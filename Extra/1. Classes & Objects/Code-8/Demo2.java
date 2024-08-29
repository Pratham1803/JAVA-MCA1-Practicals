/*Method overloading */

class Test
{
	void meth(String str)
	{
		System.out.println("String Args");
	}
	void meth(StringBuffer sb)
	{
		
		System.out.println("StringBuffer Args");
	}
	
}
class Demo2
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.meth("KKPK"); // String
		t.meth(new StringBuffer()); // StringBuffer
		//t.meth(null); // C.E:- reference to meth() is ambiguous.
	}
}