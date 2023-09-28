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
}

class Q72_Array_List_Store_Object
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

[Employee@15db9742, Employee@6d06d69c, Employee@7852e922, Employee@4e25154f, Employee@70dea4e]


Because Employee class doesn't override toString Method.
--------------------------------------------------------------------------------------------------------------
*/








