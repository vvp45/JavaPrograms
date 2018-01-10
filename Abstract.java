import java.io.*;
abstract class One
{
	abstract void calculate(double x);
}

class Two extends One
{
	void calculate(double x)
	{
		System.out.println("Square of x is = "+(x * x));
	}
}

class Three extends One
{
	void calculate(double x)
	{
	System.out.println("Cube of x is = "+ (x * x * x));
	}
}

class Four extends One
{
	void calculate(double x)
	{
		System.out.println("Square  root of x = "+ Math.sqrt(x));
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		Two t = new Two();
		Three th = new Three();
		Four f = new Four();
		t.calculate(7);
		th.calculate(5);
		f.calculate(100);
	}
}