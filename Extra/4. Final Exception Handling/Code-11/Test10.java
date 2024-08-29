import java.io.*;
class MyException extends RuntimeException{
	public String toString(){
		return "NotEligibleForVoting";
	}
}
class first{
	void checkAge(int num) throws MyException{
		if(num<18){
			MyException m=new MyException();
			throw m;
		}
		System.out.println("Age is Greater or Equal to 18 :"+num);
	}
}
class Test10{
	public static void main(String args[]) throws IOException{
		first f=new first();
		try{
			
			DataInputStream dis=new DataInputStream(System.in);

     			System.out.println("Enter Age : ");
     			
			int  age =Integer.parseInt(dis.readLine());

			f.checkAge(age);
		}
		catch(MyException m){
			System.out.println(m);
		}
	}
}
