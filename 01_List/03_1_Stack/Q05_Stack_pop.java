import java.util.*;

class Q05_Stack_pop
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		
		st.push(10);		st.push(20);		st.push(30);
		st.push(40);		st.push(50);
		
		System.out.println( st );
		
		System.out.println( st.pop() );
		System.out.println( st.pop() );
		
		System.out.println( st );
	}
}


/* 

[10, 20, 30, 40, 50]
50
40
[10, 20, 30]
 
----------------------------------------------------
*/







