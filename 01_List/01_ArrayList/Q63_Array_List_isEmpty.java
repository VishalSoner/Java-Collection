import java.util.*;

class Q63_Array_List_isEmpty
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); // Work Same
		
		al.add(10);		al.add(20);		al.add(30);
		al.add(40);		al.add(50);	
		
		System.out.println( al.isEmpty() );
		
		for(int i = 0; i < al.size(); i++)
		{
			al.remove(i);
		}
		
		System.out.println( al.isEmpty() );
	}
}


/*

false
false
--------------------------------------------------------------------------------------------------------------
*/





