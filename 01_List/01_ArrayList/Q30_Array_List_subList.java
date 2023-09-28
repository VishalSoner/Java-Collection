import java.util.*;

class Q30_Array_List_subList
{
	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(10);		al1.add(20);		al1.add(30);		al1.add(40);		al1.add(50);
		al1.add(60);		al1.add(70);		al1.add(80);		al1.add(90);		al1.add(100);
		System.out.println( al1 );

	
		ArrayList<Integer> al2 = new ArrayList<>();
		al2 = al1.subList(2, 5);
		System.out.println( al2 );
	}
}


/*

Error same for Both Error
ArrayList<Integer> al2 = new ArrayList<>();
	al2 = al1.subList(2, 5);
or
ArrayList<Integer> al2 = al1.subList(2, 5);

List<Integer> cannot be converted to ArrayList<Integer>
               al2 = al1.subList(2, 5);
                                ^
--------------------------------------------------------------------------------------------------------------
*/



