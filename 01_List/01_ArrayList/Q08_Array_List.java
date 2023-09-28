import java.util.*;

class Q08_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer(50) );
		al.add( new String("Ram Ji") );
		
		for( Object o : al)
		{
			System.out.print( o + "  ");
		}
	}
}

/* 

10  20  30  40  50 Ram Ji

------------------------------------------------------------------------------------------------------------------------------
*/






