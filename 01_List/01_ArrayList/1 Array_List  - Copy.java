import java.util.*;

class Q80_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList(10);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]

--------------------------------------------------------------------------------------------------------------
*/








import java.util.*;

class Q81_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList(-10);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println( al );
	}
}


/*

Exception in thread "main" java.lang.IllegalArgumentException: Illegal Capacity: -10

--------------------------------------------------------------------------------------------------------------
*/








import java.util.*;

class Q82_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList(5);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println( al );
		
		al.add(60);
		al.add(70);
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 60, 70]

--------------------------------------------------------------------------------------------------------------
*/








import java.util.*;

class Q83_Array_List
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList(0);
		// ArrayList al = new ArrayList(-0);		//Work Same
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println( al );
		
		al.add(60);
		al.add(70);
		System.out.println( al );
	}
}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 60, 70]

--------------------------------------------------------------------------------------------------------------
*/








