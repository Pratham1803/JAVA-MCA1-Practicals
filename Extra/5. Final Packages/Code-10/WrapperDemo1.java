
class WrapperDemo1
{
  public static void main(String args[ ])
   {
     String str="100";
     int i=Integer.parseInt(str);

     System.out.println(Integer.toBinaryString(i));
     System.out.println(Integer.toOctalString(i));
     System.out.println(Integer.toHexString(i));

     char ch='A';
     System.out.println(Character.isDigit(ch));
     System.out.println(Character.isLetter(ch));
     System.out.println(Character.isUpperCase(ch));
     System.out.println(Character.isLowerCase(ch));
   }
}
