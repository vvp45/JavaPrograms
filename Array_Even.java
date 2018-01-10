import java.io.*;
import java.util.*;
class Array_Even
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		int []arr = new int[3];
		//int [][]trr = new int[3][3];
		System.out.println("To give input from user");
		for(int i = 0; i < 10; i++)
		{
				arr[i] = sc.nextInt();
				if((i+1)%2 == 0)
				{
					sum+=arr[i];
					count++;
				}
			float avg = (float)(sum/count);
			System.out.println("Average ="+ avg);
		}
	}
}
