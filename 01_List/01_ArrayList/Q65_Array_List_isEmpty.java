import java.util.*;

class Q65_Array_List_isEmpty
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); // Work Same
		
		al.add(10);		al.add(20);		al.add(30);
		al.add(40);		al.add(50);	
		
		System.out.println( al );
		
		int n = al.size();
		for(int i = 0; i < n; i++)
		{
			al.remove(i);
		}
		
	}
}


/*
[10, 20, 30, 40, 50]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 2


--------------------------------------------------------------------------------------------------------------
*/





