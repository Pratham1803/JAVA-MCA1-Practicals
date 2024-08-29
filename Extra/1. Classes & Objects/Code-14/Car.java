
class Car
{  
    int speed;  
      
    	Car()
    	{
    		System.out.println("Speed Using Constructor "+speed);
    	}  
   
    	{
		speed=100;
                System.out.println("Speed Using Intializer "+speed);
    	}  
        static
        {
		
              System.out.println("Speed Using static Block");
    	}
    	public static void main(String args[])
	{  
    		Car b1=new Car();  
    		Car b2=new Car();  
    	}      
}
	