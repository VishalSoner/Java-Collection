import java.util.LinkedList;

class Q22_Linked_List_retainAll
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
		
		li2.add(10);
		li2.add(20);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		
		System.out.println( li1.retainAll(li2) );		
	}
}


/*

true
------------------------------
*/







