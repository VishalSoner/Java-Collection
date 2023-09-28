import java.util.*;

class Q04_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer(2147483648) );
		
		System.out.println(al);
	}
}

/* 

Q04_Array_List.java:13: error: integer number too large: 2147483648
                al.add( new Integer(2147483648) );

------------------------------------------------------------------------------------------------------------------------------
*/






