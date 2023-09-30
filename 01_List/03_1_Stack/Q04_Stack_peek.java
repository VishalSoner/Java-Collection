import java.util.*;

class Q04_Stack_peek
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		
		st.push(10);		st.push(20);		st.push(30);
		st.push(40);		st.push(50);
		
		System.out.println( st );
		
		System.out.println( st.peek() );
		System.out.println( st.peek() );
		
		System.out.println( st );
	}
}


/* 

[10, 20, 30, 40, 50]
50
50
[10, 20, 30, 40, 50]
 
----------------------------------------------------
*/







