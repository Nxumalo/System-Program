public class Prog3
{
        // The method below formats doubles to strings and ensures that all decimal
	// points occur in the same position of the string by inserting leading spaces
	// and then extracting an appropriate substring.

	public String formatDoubleTo1Decimal(double no)
	{	String str1, str2;
		str1 = no + "";     			// change double to string value
		str1 = "    "+ str1;
		int position = str1.indexOf(".");  	// find position of decimal digit
		str2 = str1.substring(position-3,position+2);
		return str2;
	}

	public void run()
	{	double no1, no2, no3,reslt;
		no1 = 3.9;
		no2 = 23.7;
		no3 = 100.0;
		System.out.println("****"+formatDoubleTo1Decimal(no1)+"****");
		System.out.println("****"+formatDoubleTo1Decimal(no2)+"****");
		System.out.println("****"+formatDoubleTo1Decimal(no3)+"****");
	}

      	public static void main(String args[])
	{	Prog3 tstObj = new Prog3();
		tstObj.run();
	}
}