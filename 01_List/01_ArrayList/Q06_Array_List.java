import java.util.*;

class Q06_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
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

error: incompatible types: Object cannot be converted to int
                for( int i : al)
                             ^

------------------------------------------------------------------------------------------------------------------------------
*/






