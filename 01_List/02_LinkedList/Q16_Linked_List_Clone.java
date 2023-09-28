import java.util.LinkedList;

class Q16_Linked_List_Clone
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		LinkedList li2 = (LinkedList) li1.clone();
		
		System.out.println( li1 );
		System.out.println( li2 );
		
		li2.add(50);
		
		System.out.println( li1 );
		System.out.println( li2 );
		
	}
}


/*
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 50]

------------------------------
*/







