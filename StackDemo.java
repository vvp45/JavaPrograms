import java.io.*;
import java.util.*;
class StackDemo
{
	public static void main(String args[])throws Exception
	{
		Stack<Integer> st = new Stack<>();
		int choice = 0;
		int pos, elemenent;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Stack Operation");
			System.out.println("1. Push\n 2. Pop\n 3. Search\n 4.Exit");
			System.out.println("Your choice");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Element");
					elemenent = Integer.parseInt(br.readLine());
					st.push(elemenent);
					break;
					
				case 2:
					Integer i = st.pop();
					System.out.println("Popped= "+ i);
					break;
					
				case 3:
					System.out.println("Which Element?");
					elemenent = Integer.parseInt(br.readLine());
					pos = st.search(elemenent);
					if(pos == -1)
						System.out.println("Element not Found in the stack");
					else
						System.out.println("Position "+ pos);
					break;
					default:
					return;
			}
			System.out.println("statck contents "+st);
		}while(choice != 4);
	}
}