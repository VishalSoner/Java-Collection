import java.util.*;

class Q68_Array_List_ArrayStoreException
{
	public static void main(String args[])
	{
		Object io[] = new String[5];
		io[2] = 55;
		
		for(int i = 0; i < io.length; i++)
		{
			System.out.print( io[i] + " ,  ");
		}
	}
}


/*

Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer

--------------------------------------------------------------------------------------------------------------
*/








