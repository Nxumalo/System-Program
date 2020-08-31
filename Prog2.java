
public class Prog2
{
	// The method below rounds a decimal number to 1 decimal digit

	public double roundTo1DecimalDigit(double no)
	{  	double reslt;
		reslt =  ((int) Math.round(no*10.0)) /10.0;
		return reslt;
	}
	public void run()
	{	double no,reslt;
		no = 34.789;
		reslt = roundTo1DecimalDigit(34.789);
		System.out.println("Original number: "+no+" Rounded number is "+reslt);
	}

      	public static void main(String args[])
	{	Prog2 tstObj = new Prog2();
		tstObj.run();
	}
}