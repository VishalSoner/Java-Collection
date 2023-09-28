import java.util.LinkedList;

class Q11_Linked_List_Error
{
	public static void main(String args[])
	{
		LinkedList li = new LinkedList();
		
		System.out.println( li.removeFirst() );
		
		System.out.println( li );
	}
}


/* 

Exception in thread "main" java.util.NoSuchElementException



this Error occur for all like getFirst, getLast, removeFirst, removeLast
Exception in thread "main" java.util.NoSuchElementException

----------------------------------------------------
*/







