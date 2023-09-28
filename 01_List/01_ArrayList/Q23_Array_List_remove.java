// if want to remove data from list on basis of content, We use Collection remove Method.
// And we want to remove data on basis of Index, We use list remove Method.

import java.util.*;

class Q23_Array_List_remove
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
		
		al.remove(2);
		System.out.println( al );
		
		al.remove(5);
		System.out.println( al );
		
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 40, 50]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4




	al.remove();
error: no suitable method found for remove(no arguments)
                al.remove();
                  ^
--------------------------------------------------------------------------------------------------------------
*/



