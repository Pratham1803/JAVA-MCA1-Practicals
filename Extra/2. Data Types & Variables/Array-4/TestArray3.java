import java.util.*;
class TestArray3
{
	public  static void main(String args[])
	{
		Integer [] values={ 12, 10 , 8, 3, 9, 11, 25,2};

		// fill the array with 0's
		Arrays.fill(values, 0);
		System.out.println(Arrays.toString(values));
		
		// fill with 5 from index 0 to 4
		Arrays.fill(values, 0,4,5);
		System.out.println(Arrays.toString(values));
	}
}
   	

