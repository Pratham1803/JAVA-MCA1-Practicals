public class  GC
{
	public static void main(String[] args)
    	{
		GC  c = new  GC();
        	c=null;		
		System.out.println("Value of C at Creation : " + c);
		System.gc();
		
    	}
	protected  void finalize()
    	{
        	System.out.println("Garbage Collection is Performed by JVM");
		
    	} 
}
