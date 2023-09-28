import java.util.*;

class Q20_Array_List_set
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println( al );
		
		al.set(5, 1000);
		
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 5

--------------------------------------------------------------------------------------------------------------
*/



