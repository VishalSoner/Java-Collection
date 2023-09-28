import java.util.*;

class Q32_Array_List_Set
{
	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(10);		al1.add(20);		al1.add(30);		al1.add(40);		al1.add(50);
		al1.add(60);		al1.add(70);		al1.add(80);		al1.add(90);		al1.add(100);
		System.out.println( al1 );

		List al2 = al1.subList(2, 5);
		System.out.println( al2 );
		System.out.println();
		
		al1.set(2, 5000);
		System.out.println( al1 );
		System.out.println( al2 );
	}
}


/*

[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
[30, 40, 50]

[10, 20, 5000, 40, 50, 60, 70, 80, 90, 100]
[5000, 40, 50]
--------------------------------------------------------------------------------------------------------------
*/



