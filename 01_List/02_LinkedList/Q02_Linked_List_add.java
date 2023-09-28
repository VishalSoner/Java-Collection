import java.util.LinkedList;

class Q02_Linked_List
{
	public static void main(String args[])
	{
		LinkedList li = new LinkedList( 10 );
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println( li );
	}
}


/* 

 error: incompatible types: int cannot be converted to Collection
    LinkedList li = new LinkedList( 10 );
									^


We can pass constructor Capacity in LinkedListm,But 
In ArrayList we can pass/set ArrayList Capacity.


----------------------------------------------------
*/







