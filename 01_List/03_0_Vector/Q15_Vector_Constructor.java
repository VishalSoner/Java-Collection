import java.util.*;

class Q15_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector(6, 4);
		
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
		for(int i = 1; i <= 10; i++)
		{
			vr.add(i*10);
		}
		
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
		vr.add(500);
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
	}
}


/* 

Vector vr = new Vector(6, 4);
0
6

10
10

11
14


if Case : 
Vector vr = new Vector(-6, 4);
Exception in thread "main" java.lang.IllegalArgumentException: Illegal Capacity: -6
----------------------------------------------------
*/







