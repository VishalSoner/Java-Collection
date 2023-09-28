import java.util.*;

class Q03_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer("Ram") );
		
		System.out.println(al);
	}
}

/* 

Exception in thread "main" java.lang.NumberFormatException: For input string: "Ram"

------------------------------------------------------------------------------------------------------------------------------
*/






