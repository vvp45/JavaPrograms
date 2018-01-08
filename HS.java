import java.io.*;
import java.util.*;
class HS
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<>();
		
		hs.add("India");
		hs.add("Japan");
		hs.add("America");
		System.out.println("Hash set "+ hs);
		
		Iterator it = new hs.iterator();
		System.out.println("Elements using iterator");
		while(it.hasNext())
		{
			String str = (String)it.next();
		System.out.println(str);
		}
	}
}