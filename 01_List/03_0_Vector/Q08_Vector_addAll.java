import java.util.*;

class Q08_Vector_addAll
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
		vr.add(10);
		vr.add(20);
		vr.add(30);
		vr.add(40);
		vr.add(50);
		
		Vector vr2 = new Vector();
		vr2.addAll(vr);
		
		System.out.println( vr );
		System.out.println( vr2 );
	}
}


/* 

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]
----------------------------------------------------
*/







