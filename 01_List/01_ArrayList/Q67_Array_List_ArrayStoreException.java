import java.util.*;

class Q67_Array_List_ArrayStoreException
{
	public static void main(String args[])
	{
		Object io[] = new String[5];
		// io[2] = 55;
		
		for(int i = 0; i < io.length; i++)
		{
			System.out.print( io[i] + " ,  ");
		}
	}
}


/*

null ,  null ,  null ,  null ,  null ,

--------------------------------------------------------------------------------------------------------------
*/







