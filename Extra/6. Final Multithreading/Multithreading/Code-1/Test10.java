/*Demonstrating main thread */
class Test10
{
	public static void main(String args[])
	{
		Thread t;
		
		t=Thread.currentThread();

		System.out.println(t);/* toString method of object class is overriden and gives description of thread*/

		t.setName("MyThread");

		System.out.println(t);

		System.out.println(t.getName());

		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}