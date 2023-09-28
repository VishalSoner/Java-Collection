/* 

1. Collection can store objects onlu and autoboxing and unboxign was introduce in 1.5 version
2. before 1.4 we pass manully parameter.

*/
import java.util.*;

class Q02_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add( new Integer(10) );
		al.add( new Integer(20) );
		al.add( new Integer(30) );
		al.add( new Integer(40) );
		al.add( new Integer(50) );
		
		System.out.println(al);
	}
}

/* 

[10, 20, 30, 40, 50]

------------------------------------------------------------------------------------------------------------------------------
*/






