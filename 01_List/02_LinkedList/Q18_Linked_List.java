import java.util.LinkedList;

class Q18_Linked_List
{
	public static void main(String args[])
	{
		LinkedList<Integer> li1 = new LinkedList<>();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add("Ram ji");
		
		System.out.println( li1 );
		
	}
}


/*
error: no suitable method found for add(String)
                li1.add("Ram ji");
                   ^

------------------------------
*/







