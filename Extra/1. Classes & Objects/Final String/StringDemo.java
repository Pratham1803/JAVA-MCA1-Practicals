class StringDemo
{
  public static void main(String args[ ])
   {
      	String str1="Click-In";
      	String str2="Click-In";
      	String str3="Dlick-In";
     	 String str4="Hello";

     	 System.out.println(str1.length());
     	 System.out.println(str1.charAt(2));
     	 System.out.println(str1.equals(str2));
     	 System.out.println(str1.equals(str3));
    	 System.out.println(str1.compareTo(str3));
      	 System.out.println(str3.compareTo(str1));
     	 System.out.println(str1.compareTo(str2));
	 System.out.println(str4.replace('l','p'));
    	 System.out.println(str1.toUpperCase());
     	 System.out.println(str1.toLowerCase());
   }
}
