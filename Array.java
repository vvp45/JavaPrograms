import java.io.*;
class Employee
{
	String name;
	int id;
	Employee(String n, int i)
	{
		name = n;
		id = i;
	}
	
	void display()
	{
		System.out.println(name+ "\t" +id);
	}
}

class Array
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee e[] = new Employee[5];
		for(int i = 0; i <5; i++)
		{
			System.out.println("Enter the name");
			String name = br.readLine();
			
			System.out.println("Enter the ID");
			int id = Integer.parseInt(br.readLine());
			e[i] = new Employee(name, id);
		}
		
		System.out.println("Employees Data");
		for(int i = 0; i <5; i++)
		{
			e[i].display();
		}
	}
}