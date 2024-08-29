//To generate the terms of Fibonacci series 


class MyThread1 implements Runnable
{
  	Thread t;

	MyThread1(String tname)
   	{
     		t=new Thread(this,tname);
		t.start();
   	}

	public void run()
   	{
		int n1=0,n2=1,n3,i,count=10;    
 
		System.out.print("Fibonacci Series is :  ");		
		
		System.out.print(n1+" "+n2);//printing 0 and 1     

		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 		{    
 
			n3=n1+n2;    
  			
			System.out.print(" "+n3);    
 		
			n1=n2;    
  			
			n2=n3;  

			try
          		{
				Thread.sleep(1000);
          		}
			catch(InterruptedException ie){}

  
 		}    
  
   	}
}

class Test22
{
	public static void main(String args[ ])
   	{
		new MyThread1("One");
		
   	}
}
