import java.util.LinkedList;

class Q09_Linked_List_removeFirst
{
	public static void main(String args[])
	{
		LinkedList li = new LinkedList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println( li );
		
		System.out.println( li.removeFirst() );
		
		System.out.println( li );
	}
}


/* 

[10, 20, 30, 40, 50]
10
[20, 30, 40, 50]
----------------------------------------------------
*/







