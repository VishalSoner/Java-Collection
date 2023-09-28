import java.util.*;

class Q11_Vector_toArray
{
	public static void main(String args[])
	{
		Vector vr = new Vector();
		
		vr.add(10);		vr.add(20);		vr.add(30);
		vr.add(40);		vr.add(50);
		
		Object o[] = new Object[vr.size()];
		o = vr.toArray();
		
		System.out.println( o );
		
		for( Object io : o)
		{
			System.out.print( io + ", " );
		}
		
	}
}


/* 

[Ljava.lang.Object;@15db9742
10, 20, 30, 40, 50,

----------------------------------------------------
*/







