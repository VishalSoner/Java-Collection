import java.util.*;

class Q64_Array_List_isEmpty
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		// ArrayList<Integer> al = new ArrayList<>(); // Work Same
		
		al.add(10);		al.add(20);		al.add(30);
		al.add(40);		al.add(50);	
		
		System.out.println( al.isEmpty() );
		
		for(int i = 0; i < al.size(); i++)
		{
			al.remove(i);
		}
		
		System.out.println( al );
		System.out.println( al.isEmpty() );
	}
}


/*


false
[20, 40]
false




[10, 20, 30, 40, 50];
i = 0		[20, 30, 40, 50]; 	 remove(10)
i = 1		[20, 40, 50];		 remove(30)
i = 2		[20, 40, 50];		 remove(50)

[20, 40]
--------------------------------------------------------------------------------------------------------------
*/





