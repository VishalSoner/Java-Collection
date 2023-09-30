import java.util.*;

class Q02_Stack_push
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		System.out.println( st.size() );
		System.out.println( st.capacity() );
		
		for(int i = 1; i  <= 10; i++)
			st.push(10*i);
		
		System.out.println( st.size() );
		System.out.println( st.capacity() );

		st.push(500);
		System.out.println( st.size() );
		System.out.println( st.capacity() );
	}
}


/* 

0
10

10
10

11
20




1. Default Capacity of Stack is 10.
2. Increase Capacity for this fromula :
   new Capa. = Curr. * 2;

----------------------------------------------------
*/







