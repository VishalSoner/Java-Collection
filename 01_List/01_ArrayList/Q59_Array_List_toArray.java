import java.util.*;

class Q59_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		Integer i[] = new Integer[ al.size() ];
		i = al.toArray(i);
		
		System.out.println( al );
		
		for(int j = 0; j < al.size(); j++)
			System.out.print( i[j] + ", " );
		
	}
}


/*
if : 	i = al.toArray(i);

error: incompatible types: Object[] cannot be converted to Integer[]
                i = al.toArray(i);
                              ^
--------------------------------------------------------------------------------------------------------------
*/




