import java.io.*;

class MyException extends RuntimeException
{
	public String toString()
	{
		return"Exception: NameIsInvalid";
	}
}
class first
{
	void strCheck(String s) throws MyException
	{
		String str="KK";
		
		
    		if(!str.equals(s)) 
		{
        		
			MyException m=new MyException();
			throw m;
    		}
		System.out.println("Employee Name  is : "+str);	
	}
}
class Test11
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream dis =new DataInputStream(System.in);
		System.out.println("Enter Employee Name: ");
		String str= dis.readLine();
		
		first f=new first();
		try
		{
			f.strCheck(str);
		}
		catch(MyException m)
		{
			System.out.println(m);
		}
	}
}
