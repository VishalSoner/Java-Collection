import java.util.*;

class Q09_Vector_removeAll
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
		
		vr2.add(10);
		vr2.add(20);
		vr2.add(300);
		vr2.add(400);
		vr2.add(500);
		
		
		vr2.removeAll(vr);
		
		System.out.println( vr );
		System.out.println( vr2 );
	}
}


/* 

[10, 20, 30, 40, 50]
[300, 400, 500]
----------------------------------------------------
*/







