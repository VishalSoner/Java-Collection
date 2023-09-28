import java.util.*;

class Q81_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList(-10);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println( al );
	}
}


/*

Exception in thread "main" java.lang.IllegalArgumentException: Illegal Capacity: -10

--------------------------------------------------------------------------------------------------------------
*/








