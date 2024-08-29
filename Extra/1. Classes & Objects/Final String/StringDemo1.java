/*
equals() method compares the string and "==" compares the reference.
But in output the hashcode() method prints the reference number for 
both strings as same then why the "==" returns "false". They have same 
hasCode values as because they are referring  to same memory allocation.

*/
class StringDemo1
{
 	  
	public static void main(String args[])
	{

		String str = "Name";
    		String str1 = new String("Name");

    		if(str.equals(str1))
        		System.out.println("true");
    		else
        		System.out.println("false");
    		if(str==str1)
        		System.out.println("true");
    		else
        		System.out.println("false");

    		System.out.println(str.hashCode());
    		System.out.println(str1.hashCode());
	}
}

