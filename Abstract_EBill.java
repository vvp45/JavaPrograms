import java.io.*;
abstract class Plan
{
	double rate;
	public abstract void getRate();
	public void calculateBill(int units)
	{
	System.out.println("Bill Amount for "+ units);
	System.out.println("Total Bill = "+ (rate * units));
	}
}
	
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate = 5.00;
	}
}

class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate = 2.56;
	}
}

class Abstract_EBill
{
	public static void main(String args[])
	{
		Plan p;
		p = new CommercialPlan();
		p.getRate();
		p.calculateBill(300);
		
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(600);
	}
}