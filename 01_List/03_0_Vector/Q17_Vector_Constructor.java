import java.util.*;

class Q17_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector(0, 0);

		System.out.println( vr.size());
		System.out.println( vr.capacity() );
		
		for(int i = 1; i <= 20; i++)
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
0

20
32

21
32

----------------------------------------------------
*/







