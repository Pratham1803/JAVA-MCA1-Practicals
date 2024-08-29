public class  GC
{
	public static void main(String[] args)
    	{
		GC  c = new  GC();
        	c=null;
		System.gc();
		System.out.println("Value of C at Creation : " + c);
		c.finalize();
    	}
	public void finalize()
    	{
        	System.out.println("Garbage Collected");
		
    	}
}
