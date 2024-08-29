// Wap to reverse the digits using thread

class MyThread implements Runnable
{
  	Thread t;
 	 String args[];


	MyThread(String args[])
  	 {
		this.args=args;     
     		t=new Thread(this);
		t.start();
   	}

	public void run()
   	{
		int i[]=new int[3];

		i[0]=Integer.parseInt(args[0]);
		i[1]=Integer.parseInt(args[1]);
		i[2]=Integer.parseInt(args[2]);

		int temp;

		for(int j=0; j<i.length; j++)
        	{
			for(int k=0; k<i.length-1; k++)
              		{
				if(i[k+1]>i[k])
                  		{
					temp=i[k];
					i[k]=i[k+1];
					i[k+1]=temp;                         
                  		}
              		}
        	} 


		for(int c=0; c<i.length; c++)
        	{
			System.out.println(i[c]);

			try
            		{
				Thread.sleep(1000);
            		}
			catch(InterruptedExceptionie){}
        	}

   	}
}

class Test21
{
	public static void main(String args[ ]) 
   	{
		new MyThread(args);    
        }
}
