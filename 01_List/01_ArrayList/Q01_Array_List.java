/* 
1. Null value can also be inserted.
2. It allows to Store duplicate data.
3. We can store heterogeneous type of data.

*/
import java.util.*;

class Q01_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("A");
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(null);
		al.add(70);
		al.add("Vishal Soner");
		al.add(80);
		al.add(90);
		
		for( Object o : al)
		{
			System.out.print( o + "  ");
		}
	}
}

/*
10  20  30  A  40  50  60  null  70  Vishal Soner  80  90 

------------------------------------------------
*/




