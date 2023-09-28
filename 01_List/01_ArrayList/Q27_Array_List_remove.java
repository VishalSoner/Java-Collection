import java.util.*;

class Q27_Array_List_remove
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>();  Both work Same
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println( al );
		
		System.out.println( al.remove(2)  );
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
30
[10, 20, 40, 50]


--------------------------------------------------------------------------------------------------------------
*/



