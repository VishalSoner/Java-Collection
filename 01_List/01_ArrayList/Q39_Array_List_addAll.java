import java.util.*;

class Q39_Array_List_addAll
{
	public static void main(String args[])
	{
		// ArrayList<Integer> al1 = new ArrayList<>(); 					//It's work same

		ArrayList al1 = new ArrayList();
		al1.add(10);		al1.add(20);		al1.add(30);		al1.add(40);		al1.add(50);
		
		ArrayList al2 = new ArrayList();
		al2.add(100);		al2.add(200);		al2.add(300);		al2.add(400);		al2.add(500);
		
		System.out.println( al1 );
		System.out.println( al2 );
		
		al1.addAll(al2);

		System.out.println( al1 );
		System.out.println( al2 );
	}
}


/*


[10, 20, 30, 40, 50]
[100, 200, 300, 400, 500]
[10, 20, 30, 40, 50, 100, 200, 300, 400, 500]
[100, 200, 300, 400, 500]



--------------------------------------------------------------------------------------------------------------
*/







