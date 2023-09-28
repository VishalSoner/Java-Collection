import java.util.*;

class Q38_Array_List_addAll
{
	public static void main(String args[])
	{
		ArrayList al1 = new ArrayList();
		al1.add(10);		al1.add(20);		al1.add(30);		al1.add(40);		al1.add(50);
		
		al1.addAll(55);
		System.out.println( al1 );
	}
}


/*


error: no suitable method found for addAll(int)
                al1.addAll(55);
                   ^



--------------------------------------------------------------------------------------------------------------
*/







