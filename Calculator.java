import java.util.*;
/**


<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Programming assignment <p>
<p>Last modified: 31/08/2020<p>

This class is super class for BetterCalulation class.

*/
public class Calculator
{
	private double result;					//sets memory to 0
	private double precision = 0.0001;			//sets precision to 0.0001
//Numbers this close to zero are treated as if equal to zero.

/**
THis is the main class. It basically makes a new object for the calculator class and calls it for calculations. It also handles errors 
*/	
	public static void main(String[] args)
	{
		Calculator clerk = new Calculator();			//new object for class
		try
		{
			System.out.println("Calculator is on.");
			System.out.print("Format of each line: ");
			System.out.println("operator space number");
			System.out.println("For example: + 3");
			System.out.println("To end, enter the letter e.");
			clerk.doCalculation();
		}
		catch(UnknownOpException e) 				//catches error
		{
			clerk.handleUnknownOpException(e); 		//if unknown operation is entered
		}
		catch(DivideByZeroException e) 				//catches error
		{
			clerk.handleDivideByZeroException(e); 		//if divide by zero
		}
		System.out.println("The final result is "
					+ clerk.resultValue());		//outputs result
		System.out.println("Calculator program ending.");
	}
/**
The constructor with no parameters.
*/
	public Calculator()
	{
		result = 0;						//sets result to zero
	}
/**
This class resets the value of result
*/
	public void reset()
	{
		result = 0;						//resetting value of result
	}
/**
The set method for results
@param newResult
*/
	public void setResult(double newResult)
	{
		result = newResult;					//sets result to newResult
	}
/**
the is like the get method for result
@return result
*/
	public double resultValue()
	{
		return result;						//returns result
	}
/**
The heart of a calculator. This does not give instructions. Input errors throw exceptions. It allows the user to enter an operation, space then a number. THe number becomes the result. If the user enters other opereations which are allowed in the program, e.g c, the program clears memory or does the corresponding activity.
*/
	public void doCalculation() throws DivideByZeroException, UnknownOpException
	{
		char nextOp;						//sets new character
		double nextNumber;					//sets new number
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;					//default boolean to check if user is done
		result = 0;
		System.out.println("result = " + result);
		while (! done)						//the loop for when user is not done calculating
		{
			nextOp = (keyboard.next()).charAt(0);		//sets the character nextOp
			if ((nextOp == 'e') || (nextOp == 'E'))		//for exiting the program
				done = true;				//sets boolean done to true so as to exit
			else
			{
				nextNumber = keyboard.nextDouble();	//sets nextNumber
				result = evaluate(nextOp, result, nextNumber);
				System.out.println("result " + nextOp + " "
								+ nextNumber + " = " + result);
				System.out.println("updated result = " + result);
			}
		}
	}

/**
Returns n1 op n2,
provided op is one of '+', '-', '*',or '/'.
Any other value of op throws UnknownOpException.

This method does the evaluation of the calculation. It checks the operation, then space and then the number. If all correct it then updates result to that number. Otherwise it throws an exception for whatever wrong input user enters.

@param op for operation
@param n1 for first number 
@param n2 for second number
*/
	public double evaluate(char op, double n1, double n2)	throws DivideByZeroException, UnknownOpException
	{
		double answer;					//sets new answer
		switch (op) 					//switches the operations
		{
			case '+': 				//adding 
				answer = n1 + n2; 		//answer is sum of two numbers
				break;
			case '-': 				//subtracting
				answer = n1 - n2; 		//answer is subtraction of two numbers
				break;
			case '*': 				//multiplication
				answer = n1 * n2; 		//answer is a product of two numbers
				break;
			case '/':				//dividing
				if ( (-precision < n2) && (n2 < precision))
					throw new DivideByZeroException();	//error checking for dividing by 0
					answer = n1/n2;				//answer is a quotient
					break;
			default:
				throw new UnknownOpException();

		}
		return answer;
	}
/**
Exception for dividing by zero
*/
	public void handleDivideByZeroException(DivideByZeroException e)	
	{
		System.out.println("Dividing by zero."); 
		System.out.println("Program aborted");
		System.exit(0); 
	}
/**
Exception for foreign operation
*/
	public void handleUnknownOpException(UnknownOpException e)
	{
		System.out.println(e.getMessage());
		System.out.println("Try again from the beginning:");
		try
		{
			System.out.print("Format of each line: ");
			System.out.println("operator number");
			System.out.println("For example: + 3");
			System.out.println("To end, enter the letter e.");
			doCalculation();
		}
		catch(UnknownOpException e2) 				//catching the error
		{
			System.out.println(e2.getMessage());		//outputs a message for alert
			System.out.println("Try again at some other time."); 
			System.out.println("Program ending.");
			System.exit(0); 
		}
		catch(DivideByZeroException e3) 
		{
			handleDivideByZeroException(e3); 		//catches dividing by zero
		}
	}

}
