import java.util.*;

class Q07_Stack_empty
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		
		System.out.println( st.empty() );
		
		st.push(10);		st.push(20);
		st.push(30);		st.push(40);
		st.push(50);		st.push(60);
		
		System.out.println( st.empty() );
		
	}
}


/* 

true
false

----------------------------------------------------
*/







