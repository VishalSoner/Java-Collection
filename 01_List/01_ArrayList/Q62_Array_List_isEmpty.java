import java.util.*;

class Q62_Array_List_isEmpty
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); // Work Same
		
		System.out.println( al.isEmpty() );
		
		
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		System.out.println( al.isEmpty() );
	}
}


/*

true
false
--------------------------------------------------------------------------------------------------------------
*/





