import java.util.*;

class Q16_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector(6, -4);
		
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
		for(int i = 1; i <= 20; i++)
		{
			vr.add(i*10);
		}
		
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
		vr.add(500);
		vr.add(501);
		vr.add(502);
		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
	}
}


/* 
0
6

20
24

23
24

----------------------------------------------------
*/







