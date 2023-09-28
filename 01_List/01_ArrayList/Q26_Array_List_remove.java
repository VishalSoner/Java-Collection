import java.util.*;

class Q26_Array_List_remove
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
		
		al.remove( new Integer(20)  );
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
[10, 30, 40, 50]

--------------------------------------------------------------------------------------------------------------
*/



