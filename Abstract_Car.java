import java.io.*;
abstract class Car
{
	int regno;
	Car(int r)
	{
		regno = r;
	}
	void fuelTank()
	{
		System.out.println("Fill the Tank");
	}
	
	abstract void Steering(int direction, int angle);
	abstract void Break(int force);
}

class Maruti extends Car
{
	Maruti(int regno)
	{
		super(regno);
	}
	void Steering(int direction, int angle)
	{
		System.out.println("Take a turn");
	}
	
	void Break(int force)
	{
		System.out.println("Hydrulics Break is applied");
	}
}


class Truck extends Car
{
	Truck(int regno)
	{
		super(regno);
	}
	void Steering(int direction, int angle)
	{
		System.out.println("Power Steering Take a turn");
	}
	
	void Break(int force)
	{
		System.out.println("Hydrulics Break is applied");
	}
}


class Abstract_Car
{
	public static void main(String args[])
	{
		Maruti m = new Maruti(4545);
		Truck t = new Truck(9090);
		
		Car ref;
		ref = m;
		ref.fuelTank();
		ref.Steering(1, 90);
		ref.Break(500);
	}
}
