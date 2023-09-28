import java.util.LinkedList;

class Q28_Linked_List_set
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();

		li1.add(10);		li1.add(20);		li1.add(30);
		li1.add(40);		li1.add(50);
		
		System.out.println( li1 );
		
		li1.set(2, 500);
		
		System.out.println( li1 );
	}
}


/*


[10, 20, 30, 40, 50]
[10, 20, 500, 40, 50]
------------------------------
*/







