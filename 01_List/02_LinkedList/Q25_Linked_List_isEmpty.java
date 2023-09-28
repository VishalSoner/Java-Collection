import java.util.LinkedList;

class Q25_Linked_List_isEmpty
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();

		System.out.println( li1.isEmpty() );
		
		li1.add(10);		li1.add(20);		li1.add(30);
		li1.add(40);		li1.add(50);
		
		System.out.println( li1.isEmpty() );
	}
}


/*



true
false

------------------------------
*/







