import java.util.*;

class Q22_Array_List_add
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println( al );
		
		System.out.println( al.add(2, 1000) );
		
		System.out.println( al );
	}
}


/*

error: 'void' type not allowed here
                System.out.println( al.add(2, 1000) );
                                          ^
--------------------------------------------------------------------------------------------------------------
*/



