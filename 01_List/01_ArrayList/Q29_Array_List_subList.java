import java.util.*;

class Q29_Array_List_subList
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);		al.add(20);		al.add(30);		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println( al );
	
		// System.out.println( al.subList(2, 5) );
		// System.out.println( al.subList(0, 5) );
		// System.out.println( al.subList(8, 10) );
		// System.out.println( al.subList(10, 10) );
		// System.out.println( al.subList(20, 25) );
		System.out.println( al.subList(20, 10) );
		
	}
}


/*
al.subList(int start, int end) );

Case - 1
al.subList(2, 5)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
[30, 40, 50]


Case - 2
al.subList(0, 5)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
[10, 20,30, 40, 50]


Case - 3
al.subList(8, 10)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
[90, 100]


Case - 4
al.subList(10, 10)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
[]


Case - 5
al.subList(20, 25)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
IndexOutOfBoundsException


Case - 6
al.subList(8, 4)
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
IllegalArgumentException


--------------------------------------------------------------------------------------------------------------
*/



