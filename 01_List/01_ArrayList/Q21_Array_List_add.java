import java.util.*;

class Q21_Array_List_add
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
		
		System.out.println( al.set(2, 1000) );
		
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
30
[10, 20, 1000, 40, 50]

--------------------------------------------------------------------------------------------------------------
*/



