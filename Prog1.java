
public class Prog1
{	// This program illustrates the random method of the Math class
	// ------------------------------------------------------------
	int lowerEndOfRange = 1000;
	int upperEndOfRange = 9999;

	boolean doOne = true;
	boolean doTwo = false;
	boolean doThree = false;

	public void run()
	{	if (doOne) 
		   method1();
		if (doTwo)
		   method2();
		if (doThree)
		   method3();
	}

	// ---------------------------------------------------------------------

	public void method1()
	{	double no1;
		System.out.println("Display 10 random values between 0 and 1");
		for (int n=0; n<10; n++)
		{	no1 = Math.random();
			System.out.println("\t"+n+"\t"+no1);
		}
	}

	public void method2()
	{	int no1;
		System.out.println("Display 6 random values between 2 and 49");
		for (int n=0; n<6; n++)
		{	no1 = (int) (Math.random()*(49 - 2 + 1) + 1);
			System.out.println("\t"+n+"\t"+no1);
		}
	}

	public void method3()
	{	int no1;
		System.out.println("Display 10 random INTEGERS between 1000 and 9999");
		for (int n=0; n<10; n++)
		{	no1 = (int) (Math.random()*(upperEndOfRange - lowerEndOfRange + 1) + lowerEndOfRange);
			System.out.println("\t"+n+"\t"+no1);
		}
	}

      	public static void main(String args[])
	{	Prog1 tstObj = new Prog1();
		tstObj.run();
	}

}