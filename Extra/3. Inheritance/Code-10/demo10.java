/*Method overriding */
class Bank
{
	int getInterest()
	{
		return 0;
	}

}

class SBI extends Bank
{
	int getInterest()
	{
		return 7;
	}
	
}
class Axis extends Bank
{
	int getInterest()
	{
		return 8;
	}
	
}
class HDFC extends Bank
{
	int getInterest()
	{
		return 9;
	}
	
}
class demo10
{
	public static void main(String args[])
	{
		SBI sb=new SBI(); 
		System.out.println("Interest of SBI:"+sb.getInterest());
		Axis as=new Axis();
		System.out.println("Interest of Axis:"+as.getInterest());
		HDFC hf=new HDFC();
		System.out.println("Interest of HDFC:"+hf.getInterest());
	}
	
}