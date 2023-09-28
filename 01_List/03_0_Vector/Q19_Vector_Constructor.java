import java.util.*;

class Q19_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector();

		vr.add(10);		vr.add(20);		vr.add(30);
		vr.add(40);		vr.add(50);		vr.add(60);

		System.out.println( vr.size() );
		System.out.println( vr.capacity() );
		
		Vector vr2 = new Vector(vr);
		
		System.out.println( vr2.size() );
		System.out.println( vr2.capacity() );

	}
}


/*

6
10

6
6
----------------------------------------------------
*/







