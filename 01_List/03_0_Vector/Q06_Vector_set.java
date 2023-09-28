import java.util.*;

class Q06_Vector_set
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
		vr.add(10);
		vr.add(20);
		vr.add(30);
		vr.add(40);
		vr.add(50);
		System.out.println( vr );
		
		System.out.println( vr.set(2, 200) );
		System.out.println( vr );
	}
}


/* 

[10, 20, 30, 40, 50]
30
[10, 20, 200, 40, 50]
----------------------------------------------------
*/







