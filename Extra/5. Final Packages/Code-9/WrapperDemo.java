// Wrapper Classes:--

class WrapperDemo
{
  public static void main(String args[ ])
   {
     int i=10;
     Integer intobj=new Integer(i);
     int j=intobj.intValue();
     System.out.println(j);

     double d=12.5;
     Double doubleobj=new Double(d);
     double a=doubleobj.doubleValue(); 
     System.out.println(a);
   }
}
