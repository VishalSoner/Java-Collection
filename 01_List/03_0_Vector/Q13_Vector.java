import java.util.*;

class Q13_Vector
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
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

0
10

10
10

11
20

----------------------------------------------------
*/







