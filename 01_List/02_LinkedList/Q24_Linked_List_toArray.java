import java.util.LinkedList;

class Q24_Linked_List_toArray
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		Object o[] = new Object[li1.size() ];
		o = li1.toArray();
		
		System.out.println( li1 );
		
		for( Object io : o)
		{
			System.out.print( io + ", " );
		}
	}
}


/*

[10, 20, 30, 40, 50]
10, 20, 30, 40, 50,
------------------------------
*/







