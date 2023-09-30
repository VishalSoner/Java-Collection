import java.util.*;

class Q08_Stack_Search
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		
		st.push(10);		st.push(20);		st.push(30);		
		st.push(40);		st.push(50);
		
		System.out.println( st.search(20) );
		System.out.println( st.search(200) );
		System.out.println( st.search(50) );
		System.out.println( st.search(10) );
		
	}
}


/* 

4
-1
1
5


.search() method doesn't return int of founded element it return the number 
by which it will be poped.

----------------------------------------------------
*/







