import java.util.*;

class Q09_Array_List
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
			int i = (Integer)o;
			System.out.print( i + "  ");
		}
	}
}

/* 

10  20  30  40  50  Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
------------------------------------------------------------------------------------------------------------------------------
*/






