import java.util.*;

class Q03_Stack_Constructor
{
	public static void main(String args[])
	{
		Stack st = new Stack(20);
		
		for(int i = 1; i  <= 10; i++)
			st.push(10*i);
		
		System.out.println( st.size() );
		System.out.println( st.capacity() );
	}
}


/* 

error: constructor Stack in class Stack<E> cannot be applied to given types;
                Stack st = new Stack(20);
                           ^
						   
----------------------------------------------------
*/







