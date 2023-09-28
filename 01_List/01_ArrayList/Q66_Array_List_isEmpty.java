import java.util.*;

class Q66_Array_List_isEmpty
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); // Work Same
		
		al.add(10);		al.add(20);		al.add(30);
		al.add(40);		al.add(50);	
		
		System.out.println( al );
		System.out.println( al.isEmpty() );
		
		int n = al.size();
		for(int i = 0; i < n; i++)
		{
			al.remove(0);
		}
		
		System.out.println( al );
		System.out.println( al.isEmpty() );
	}
}


/*
[10, 20, 30, 40, 50]
false

[]
true


--------------------------------------------------------------------------------------------------------------
*/





