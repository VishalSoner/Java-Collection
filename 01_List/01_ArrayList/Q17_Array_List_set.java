import java.util.*;

class Q17_Array_List_set
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
		
		al.set(2, 300);
		
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 300, 40, 50]


--------------------------------------------------------------------------------------------------------------
*/



