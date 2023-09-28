import java.util.*;

class Q54_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); //It work same.
		
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		Object o[] = new Object[al.size() ];
		al.toArray(o);
		
		System.out.println( al );
		
		for(int i = 0; i < al.size(); i++)
			System.out.print( o[i] + ", " );
		
	}
}


/*
[10, 20, 30, 40, 50]
 10, 20, 30, 40, 50,
 
--------------------------------------------------------------------------------------------------------------
*/





