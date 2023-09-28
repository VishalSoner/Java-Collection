import java.util.*;

class Q33_Array_List_add
{
	public static void main(String args[])
	{
		ArrayList al1 = new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(100);
		al2.add(200);
		al2.add(300);
		
		System.out.println( al1 );
		System.out.println( al2 );
		
		
		al1.add(al2);
		
		System.out.println( al1 );
		System.out.println( al2 );
		
	}
}


/*

[10, 20, 30, 40, 50]
[100, 200, 300]

[10, 20, 30, 40, 50, [100, 200, 300]]
[100, 200, 300]
--------------------------------------------------------------------------------------------------------------
*/



