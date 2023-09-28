import java.util.*;

class Q53_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); //It work same.
		
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		// Integer o[] = al.toArray();	//It work same.
		Integer o[] = new Integer[al.size()];
		o = al.toArray();
		
		System.out.println( al );
		
		for(int i = 0; i < al.size(); i++)
			System.out.print( o[i] + ", " );
		
	}
}


/*

 error: incompatible types: Object[] cannot be converted to Integer[]
                o = al.toArray();
                              ^
--------------------------------------------------------------------------------------------------------------
*/





