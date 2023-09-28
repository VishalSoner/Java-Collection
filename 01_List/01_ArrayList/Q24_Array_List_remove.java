import java.util.*;

class Q24_Array_List_remove
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add("20");
		System.out.println( al );
		
		al.remove("20");
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50, 20]
[10, 20, 30, 40, 50]

--------------------------------------------------------------------------------------------------------------
*/



