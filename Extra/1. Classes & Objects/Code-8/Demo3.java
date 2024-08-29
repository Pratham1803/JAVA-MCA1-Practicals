/*Method overloading */

class Test
{
	void meth(int i, float f)
	{
		System.out.println("Int Float Version");
	}
	void meth(float f, int i)
	{
		
		System.out.println("Float Int Version");
	}
	
}
class Demo3
{
	public static void main(String args[])
	{
		
		
		
		Test t=new Test();
		t.meth(10, 10.5f); // Int Float Version
		t.meth(10.5f,10); // Float Int Version
		//t.meth(10,10); // C.E:- reference to meth() is ambiguous.	
		//t.meth(10.5f,10.5f); // C.E:- can not find symbol
	}
}