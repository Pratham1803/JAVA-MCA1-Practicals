class DriverException extends RuntimeException
{
	public String toString()
	{
           return "Age Not Within The Range";
	
	}
}
class Driver
{  
    String sname;
    int vno, age;
    Driver(String name, int vn, int a){
        sname=name;
        vno=vn;
        age=a;
    }
    void checkAge()throws DriverException{
        if(age<18){
           DriverException  d = new DriverException();
           throw d;
        }
        System.out.println("Valid Age");
    }
}
public class Demo4 {
    public static void main(String[] args) {
       Driver s= new Driver("KK", 101, 25);
		try{
                        s.checkAge();
		   }
		   catch(DriverException e){
			System.out.println(e);
                        }
    }
}
