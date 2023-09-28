import java.util.*;

class Q10_Vector_subList
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
		vr.add(10);		vr.add(20);		vr.add(30);
		vr.add(40);		vr.add(50);
		
		List vr2 = new Vector();
		vr2 = vr.subList(2, 5);
		
		System.out.println( vr );
		System.out.println( vr2 );
	}
}


/* 

[10, 20, 30, 40, 50]
[30, 40, 50]

----------------------------------------------------
*/







