import java.util.*;

class Q18_Vector_Constructor
{
	public static void main(String args[])
	{
		Vector vr = new Vector();

		vr.add(10);		vr.add(20);		vr.add(30);
		vr.add(40);		vr.add(50);		vr.add(60);

		Vector vr2 = new Vector(vr);

		System.out.println( vr );
		System.out.println( vr2 );

	}
}


/*

[10, 20, 30, 40, 50, 60]
[10, 20, 30, 40, 50, 60]


----------------------------------------------------
*/







