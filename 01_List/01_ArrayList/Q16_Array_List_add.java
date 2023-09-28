import java.util.*;

class Q16_Array_List_add
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
		
		al.add(20, 35);
		
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 5


--------------------------------------------------------------------------------------------------------------
*/



