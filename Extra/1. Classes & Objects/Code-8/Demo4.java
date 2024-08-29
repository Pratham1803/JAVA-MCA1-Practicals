/*Method overloading */

class Test
{
	void meth(int x)
	{
		System.out.println("General Method");
	}
	void meth(int ...x)
	{
		int[] y=x;
		for(int p:y)
		System.out.println("Var arg method" + " " + p);
	}
	
}
class Demo4
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.meth(); // Var-arg Method
		t.meth(10,20,30); // Var-arg Method
		t.meth(10); // General Method
		
	}
}