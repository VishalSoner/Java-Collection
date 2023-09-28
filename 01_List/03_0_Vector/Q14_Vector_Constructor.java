import java.util.*;

class Q14_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector(4);
		
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
4

10
16

11
16


----------------------------------------------------
*/







