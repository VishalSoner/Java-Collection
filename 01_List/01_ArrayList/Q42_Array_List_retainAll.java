import java.util.*;

class Q42_Array_List_retainAll
{
	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);		al1.add(20);		al1.add(30);		al1.add(40);		al1.add(50);
		
		ArrayList<Number> al2 = new ArrayList<>();
		al2.add(100);		al2.add(200);		al2.add(300);
		
		System.out.println( al1 );
		System.out.println( al2 );
		
		System.out.println( al1.retainAll(al2) );

		System.out.println( al1 );
		System.out.println( al2 );
	}
}


/*

[10, 20, 30, 40, 50]
[100, 200, 300]
true
[]
[100, 200, 300]

--------------------------------------------------------------------------------------------------------------
*/







