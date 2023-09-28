import java.util.LinkedList;

class Q13_Linked_List
{
	public static void main(String args[])
	{
		LinkedList li1 = new LinkedList();
		
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		LinkedList li2 = li1;
		
		System.out.println( li1 );
		System.out.println( li2 );
		
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]


if Case : 
LinkedList li2 = new LinkedList(li1);
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]


------------------------------
*/







