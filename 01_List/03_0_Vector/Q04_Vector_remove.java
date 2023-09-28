import java.util.*;

class Q04_Vector_remove
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
		
		System.out.println( vr.remove() );
		System.out.println( vr );
	}
}


/* 

 error: no suitable method found for remove(no arguments)
                System.out.println( vr.remove() );
                                      ^
----------------------------------------------------
*/







