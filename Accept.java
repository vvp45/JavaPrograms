import java.io.*;

public class Accept
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the float Value");
		float n = Float.parseFloat(br.readLine());
		System.out.println(n);
	}
}
