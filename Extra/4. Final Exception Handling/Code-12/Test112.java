import java.io.*;

class StudException extends RuntimeException
{
	StudException(String msg)
	{
           super(msg);
	
	}

}
class Student
{
	String name;
	int sid;
	Student(String n, int id)
	{
		name=n;
		sid=id;
	}

        void strCheck() throws StudException
	{
		String str="KK";
    		try{
			if(str.equals(sname))
				throw new StudException("InValidNameException");		
			else	
				System.out.println("Student Name ="+name);	
		}
		catch(StudException a)
		{
			throw a;
		}
	}
}
class Test11
{
	public static void main(String args[]) throws IOException
	{
		Student s= new Student("Krishna", 102);
		try{

			s.strCheck();
		   }
		   catch(StudException e){
		   System.out.println(e);
	}
}
