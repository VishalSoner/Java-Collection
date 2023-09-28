import java.util.*;

class Q10_Array_List
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer(50) );
		
		for( int i : al)
		{
			System.out.print( i + "  ");
		}
	}
}

/* 

10  20  30  40  50
------------------------------------------------------------------------------------------------------------------------------
*/






