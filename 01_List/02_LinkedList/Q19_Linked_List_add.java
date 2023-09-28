import java.util.LinkedList;

class Q19_Linked_List_add
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
		
		li1.add(2, 100);
		System.out.println( li1 );
		
	}
}


/*
[10, 20, 30, 40, 50]
[10, 20, 100, 30, 40, 50]


------------------------------
*/







