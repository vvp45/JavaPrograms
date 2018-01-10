import java.io.*;
import java.util.Scanner;

class Bubble
{
	public static void main(String args[])
	{
		int a[10],n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size if an array");
		n = sc.nextInt();
		for( int i = 0;i < n;i++)
		{
			if(a[i] <= a[i+1])
			{
				System.out.println("