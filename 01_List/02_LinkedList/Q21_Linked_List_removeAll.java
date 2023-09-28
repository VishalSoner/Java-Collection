import java.util.LinkedList;

class Q21_Linked_List_removeAll
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		LinkedList li2 = new LinkedList();
		li2.add(10);		li2.add(20);		li2.add(300);
		li2.add(400);		li2.add(500);
		
		System.out.println( li1 );
		System.out.println( li2 );
		
		li2.removeAll(li1);
		
		System.out.println( li1 );
		System.out.println( li2 );
		
	}
}


/*


[10, 20, 30, 40, 50]
[10, 20, 300, 400, 500]
[10, 20, 30, 40, 50]
[300, 400, 500]


------------------------------
*/







