class Test1
{
  	int p=10;
	public static void main(String args[])
	{
		System.out.println(p);\\ CE: non static variable can not be refernced from static context.
		Test t=new Test();
		t.meth();
	}
	void meth()
	{
		System.out.println(p);
	}
}