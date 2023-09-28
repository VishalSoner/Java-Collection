import java.util.*;

class Employee
{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id   = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "" + id + ":" + name ;
	}
}

class Q73_Array_List_Store_Object
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add(new Employee(101, "Aman") );
		al.add(new Employee(102, "Bhanu") );
		al.add(new Employee(103, "Chandan") );
		al.add(new Employee(104, "Ritesh") );
		al.add(new Employee(105, "Vishal") );
		
		System.out.println( al );
	}
}


/*

Because Employee class doesn't override toString Method. 
If we Override toString Method.


[101:Aman, 102:Bhanu, 103:Chandan, 104:Ritesh, 105:Vishal]
--------------------------------------------------------------------------------------------------------------
*/








