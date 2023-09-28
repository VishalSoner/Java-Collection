import java.util.*;

class Q20_Linked_List_subList
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		System.out.println( li1 );
		
		List ab = li1.subList(2, 5);

		System.out.println( li1 );
		System.out.println( ab );
		
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]
[30, 40, 50]



if Case :
LinkedList ab = li1.subList(2, 5);
 error: incompatible types: List cannot be converted to LinkedList
                LinkedList ab = li1.subList(2, 5);
                                           ^
------------------------------
*/







