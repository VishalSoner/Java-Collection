import java.util.*;

class Q57_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>(); 
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		int i[] = new int[ al.size() ];
		i = al.toArray(i);
		
		System.out.println( al );
		
		for(int j = 0; j < al.size(); j++)
			System.out.print( i[j] + ", " );
		
	}
}


/*
error: no suitable method found for toArray(int[])
                i = al.toArray(i);
                      ^

--------------------------------------------------------------------------------------------------------------
*/





