import java.util.*;

class Q49_Array_List_size
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>(); //Because of this.
		al.add(10);		al.add(20);		al.add(30);		
		al.add(40);		al.add(50);	
		System.out.println( al.size() );
		
		al.add(60);
		System.out.println( al.size() );
	}
}


/*

5
6

--------------------------------------------------------------------------------------------------------------
*/





