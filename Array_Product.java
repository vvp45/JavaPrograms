import java.io.*;
import java.util.*;
class Array_Product
{
	
	boolean Product(int arr[], int n, int product)
	{
		for(int i = 0; i < n-1; i++)
			for(int j = i+1; j < n; j++)
			if( arr[i] * arr[j] == product && n == product)
				return true;
	return false;
	}
	public static void main(String args[])throws Exception
	{
		Array_Product a = new Array_Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println("To find the Product of two numbers in the array");
		int product = sc.nextInt();
	
			if(a.Product(arr, n, product))
				System.out.println("Yes");
			else
				System.out.println("No");
	}
}