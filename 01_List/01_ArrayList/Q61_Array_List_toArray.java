import java.util.*;

class Q61_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		al.add("60");	//String
		
		Integer i[] = new Integer[ al.size() ];
		al.toArray(i);
		
		System.out.println( al );
		
		for(int j = 0; j < al.size(); j++)
			System.out.print( i[j] + ", " );
		
	}
}


/*


Exception in thread "main" java.lang.ArrayStoreException

--------------------------------------------------------------------------------------------------------------
*/





