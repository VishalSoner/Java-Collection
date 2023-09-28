import java.util.*;

class Q44_Array_List_indexOf
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);		
		al.add(20);		
		al.add(30);		
		al.add(40);		
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		
		System.out.println( al );
		
		System.out.println( al.indexOf(10) ); 	//	 0
		System.out.println( al.indexOf(50) );	//	 4
		System.out.println( al.indexOf(80) );	//	 7
		System.out.println( al.indexOf(800) );	//	-1
		System.out.println( al.indexOf("50") ); //	-1
	}
}


/*

0
4
7
-1
-1

--------------------------------------------------------------------------------------------------------------
*/







