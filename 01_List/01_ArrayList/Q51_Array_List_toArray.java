import java.util.*;

class Q51_Array_List_toArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); //It work same.
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		
		Object o[] = al.toArray();
		
		// Object o[] = null;
		// o = al.toArray();
		
		System.out.println( al );
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print( o[i] + ", " );
		}
	}
}


/*

[10, 20, 30, 40, 50]
10, 20, 30, 40, 50,




if : 

	Object o[] = null;
	o = al.toArray();

--------------------------------------------------------------------------------------------------------------
*/





