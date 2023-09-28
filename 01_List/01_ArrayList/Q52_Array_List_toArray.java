import java.util.*;

class Q52_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); //It work same.
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		Object o[] = null;
		o = al.toArray();
		
		System.out.println( al );
		
		for(int i = 0; i < al.size(); i++)
			System.out.print( o[i] + ", " );
		
		o[2] = 25;
		
		System.out.println( al );
		
		for(int i = 0; i < al.size(); i++)
			System.out.print( o[i] + ", " );
		
	}
}


/*

[10, 20, 30, 40, 50]
10, 20, 30, 40, 50, 

[10, 20, 30, 40, 50]
10, 20, 25, 40, 50,


--------------------------------------------------------------------------------------------------------------
*/





