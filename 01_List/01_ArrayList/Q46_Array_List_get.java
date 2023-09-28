import java.util.*;

class Q46_Array_List_get
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);		al.add(60);
		al.add(70);		al.add(80);
		
		System.out.println( al );
		
		int x = al.get(2);
		System.out.println( x );
	}
}


/*

[10, 20, 30, 40, 50, 60, 70, 80]
30


--------------------------------------------------------------------------------------------------------------
*/





