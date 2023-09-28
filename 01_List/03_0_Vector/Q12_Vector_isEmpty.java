import java.util.*;

class Q12_Vector_isEmpty
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
		System.out.println( vr.isEmpty() );
		vr.add(10);		vr.add(20);		vr.add(30);
		vr.add(40);		vr.add(50);
		System.out.println( vr.isEmpty() );
	}
}


/* 

true
false

----------------------------------------------------
*/







