import java.util.*;

class Q09_Stack_Menu_Drive
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);		
		
		while( true )
		{
			System.out.println("Press - 1 :  Push Data");
			System.out.println("Press - 2 :  Pop  Data");
			System.out.println("Press - 3 :  Peek Data");
			System.out.println("Press - 4 :  Empty");
			System.out.println("Press - 5 :  Search Data");
			System.out.println("Press - 6 :  Show All Data");
			System.out.println("Press - 7 :  Exit");

			int num = sc.nextInt();

			switch(num)
			{
				case 1:
				{
					System.out.print("Enter Element : ");
					st.push( sc.nextInt() );
					System.out.println("Data Inserted");
					break;
				}

				case 2:
				{
					if( st.empty() == false) 
						System.out.println("Data Poped Succefully : " + st.pop() );
					break;
				}
				
				case 3:
				{
					if( st.empty() == false) 
					System.out.println("Data Peeked Succefully : " + st.peek() );
					break;
				}
				
				case 4:
				{
					if(st.empty() )
						System.out.println("Stack is Empty.");
					else
						System.out.println("Stack is not Empty.");
					break;
				}

				case 5:
				{
					System.out.print("Enter Element");
					System.out.println("This will be Poped At Index : " + st.search( sc.nextInt() ) );
					break;
				}
				
				case 6:
				{
					System.out.print( st );
					break;
				}
				
				case 7:
				{
					System.exit(0);
				}
				
				default :
				{
					System.out.print( "Invalid Number");
					break;
				}
			}
		System.out.println("\n\n---------------------------\n\n");
		}
	}
}


/* 

----------------------------------------------------
*/







