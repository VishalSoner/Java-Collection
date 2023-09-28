import java.util.*;

class Q03_Vector_add
{
	public static void main(String args[])
	{
		Vector<Integer> vr = new Vector<>();
		
		vr.add(10);
		vr.add(20);
		vr.add(30);
		vr.add(40);
		vr.add(50);
		vr.add("Vishal Soner");
		
		System.out.println( vr );
	}
}


/* 

 error: no suitable method found for add(String)
                vr.add("Vishal Soner");
                  ^

----------------------------------------------------
*/







