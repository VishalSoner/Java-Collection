/* 

	One Collection Parameter.
	
*/
import java.util.*;

class Q70_Array_List_One_Collection_Constructor
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		ArrayList al2 = new ArrayList(al);
		
		System.out.println( al2 );
	}
}


/*

[10, 20, 30, 40, 50, 60]

--------------------------------------------------------------------------------------------------------------
*/








