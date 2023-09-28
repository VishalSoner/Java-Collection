import java.util.*;

class Q20_Vector_Constructor
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
		
		System.out.println( vr );
		System.out.println( vr2 );
		
		vr2.add(70);
		
		System.out.println( vr );
		System.out.println( vr2 );
		
		System.out.println( vr2.size() );
		System.out.println( vr2.capacity() );

	}
}


/*

6
10

6
6

[10, 20, 30, 40, 50, 60]
[10, 20, 30, 40, 50, 60]

[10, 20, 30, 40, 50, 60]
[10, 20, 30, 40, 50, 60, 70]

7
12

----------------------------------------------------
*/







