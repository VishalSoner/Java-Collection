import java.util.*;

class Q12_Array_List_add
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer(50) );
		al.add( null );
		
		for( Integer i : al)
		{
			System.out.print( i + "  ");
		}
	}
}

/* 

10  20  30  40  50  null
------------------------------------------------------------------------------------------------------------------------------
*/






