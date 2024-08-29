/*Method overloading */
class first
{
	void display()
	{
		System.out.println("This is display");
	}
	/*void display(int num)
	{			
		System.out.println(num*num);
	}*/  

	int display(int num)
   	{
        	return(num*num);
    	} 
	
	void display(int num1,int num2)
	{
	
		System.out.println(num1*num2);	
	}
	
}

class demo8

{
	public static void main(String args[])
	{
		first f=new first();
		f.display(10,11);
		f.display(10);
	
		System.out.println(f.display(10));
		f.display();

	}
}
