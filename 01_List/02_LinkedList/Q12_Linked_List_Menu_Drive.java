import java.util.*;

class Q12_Linked_List_Menu_Drive
{
	public static void main(String args[])
	{
		LinkedList li = new LinkedList();
		Scanner sc = new Scanner(System.in);		
		
		while( true )
		{
			System.out.println("Press -  1  :  Add First");
			System.out.println("Press -  2  :  Add Last");
			System.out.println("Press -  3  :  Add After Given Value");
			System.out.println("Press -  4  :  Add Specific Point");
			System.out.println("Press -  5  :  Delete First");
			System.out.println("Press -  6  :  Delete Last");
			System.out.println("Press -  7  :  Delete After Given Point");
			System.out.println("Press -  8  :  Delete Specific Point");
			System.out.println("Press -  9  :  Search Data");
			System.out.println("Press - 10  :  Show All Data");
			System.out.println("Press - 11  :  Exit");

			int num = sc.nextInt();

			switch(num)
			{
				case 1:
				{
					System.out.print("Enter Element : " );
					li.addFirst( sc.nextInt() );
					System.out.print("Data Inserted Successfully.");
					break;
				}

				case 2:
				{
					System.out.print("Enter Element : " );
					li.addLast( sc.nextInt() );
					System.out.print("Data Inserted Successfully.");
					break;
				}
				
				case 3:
				{
					System.out.print("Enter Position : " );
					
					int pos = li.indexOf( sc.nextInt() );
					
					li.add( pos+1, sc.nextInt() );
					System.out.print("Data Inserted Successfully.");
					break;
				}
				
				case 4:
				{
					System.out.print("Enter Position : " );
					int pos = sc.nextInt();
				
					System.out.print("Enter Data : " );
					li.add( pos, sc.nextInt() );
					System.out.print("Data Inserted Successfully.");
					break;
				}
				
				case 5:
				{
					System.out.print("Enter Element : " );
					li.removeFirst();
					System.out.print("Data Deleted Successfully.");
					break;
				}

				case 6:
				{
					System.out.print("Enter Element : " );
					li.removeLast();
					System.out.print("Data Deleted Successfully.");
					break;
				}
				
				case 7:
				{
					System.out.print("Enter Position : " );
					int pos = li.indexOf( sc.nextInt() );
					
					li.remove(pos+1);
					System.out.print("Data Deleted Successfully.");
					break;
				}
				
				case 8:
				{
					System.out.print("Enter Position : " );
					int pos = sc.nextInt();
					
					li.remove(pos);
					System.out.print("Data Deleted Successfully.");
					break;
				}
				
				case 9:
				{
					System.out.print("Enter Search Data : " );
					System.out.print("Data At Index :  " + li.indexOf(sc.nextInt() ) );
					break;
				}
				
				case 10:
				{
					System.out.println(li);
					break;
				}
				
				case 11:
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

Exception in thread "main" java.util.NoSuchElementException



this Error occur for all like getFirst, getLast, removeFirst, removeLast
Exception in thread "main" java.util.NoSuchElementException

----------------------------------------------------
*/







