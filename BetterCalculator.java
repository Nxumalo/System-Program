import java.util.*;
/**

<p>Author:  Fraser Nxumalo.</p>
<p>Email:   3538264@myuwc.ac.za</p>
<p>Programming assignment 4.5</p>
<P>Last edited 31/08/2020</p>

This class is a child class for calculator class. It inherits methods and attributes and also overides some methods for better use. It has the ability to add values to memory, resets memory to zero and also does basic mathematical calculations.

*/
public class BetterCalculator extends Calculator{

	private double memory=0.0;					//sets memory to 0
	private double precision = 0.0001;				//sets precision to 0.0001


	
	
/**
THis is the main class. It basically makes a new object for the calculator class and calls it for calculations. It also handles errors 
*/	
	public static void main(String[] args)
	{
		BetterCalculator clerk = new BetterCalculator();		//new object for class
		try
		{
			System.out.println("Calculator is on.");
			System.out.print("Format of each line: ");
			System.out.println("operator space number p");
			System.out.println("Press m to add number to memory");
			System.out.println("Press r to check value n memory");
			System.out.println("Press c to clear memory");
			System.out.println("For example: + 3");
			System.out.println("To end, enter the letter e.");
			clerk.doCalculation();
		}
		catch(UnknownOpException e) 					//catches error
		{
			clerk.handleUnknownOpException(e); 			//if unknown operation is entered
		}
		catch(DivideByZeroException e) 					//catches error
		{
			clerk.handleDivideByZeroException(e); 			//if divide by zero
		}
		System.out.println("The final result is "
					+ clerk.resultValue());			//outputs result
		System.out.println("Calculator program ending.");		
	}
/**
The constructor with no parameters.
*/	
	public BetterCalculator(){
		super.setResult(0);						//sets result to 0
		
	
	}	
	
/**
The set method for memory
@param num which is the number to add to memory
*/	
	public void setMemory(double num){
		memory=num;							//sets memory to user's preference

	}
/**
The get method for memory
@return memory which is the value stored in memory
*/
	public double getMemory(){
		return memory;							//returns memory

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
		super.setResult(0);
		System.out.println("result = " + super.resultValue());

		
		while (! done)					//the loop for when user is not done calculating
		{
			nextOp = (keyboard.next()).charAt(0);		//sets the character nextOp
			if ((nextOp == 'e') || (nextOp == 'E')){	//for exiting the program
				done = true;				//sets boolean done to true so as to exit
			}
			else if ((nextOp=='m') || (nextOp == 'M')){	//for storing to memory
				setMemory(super.resultValue());		//adds  number in memory
				System.out.println("The number being stored in memory is : "+super.resultValue());
			}
			else if ((nextOp == 'r') || (nextOp == 'R')){	//checks memory value
				System.out.println("Number in memory is: "+ getMemory());

			}
			else if((nextOp == 'c') || (nextOp == 'C')){	//for clearing memory

				super.reset();				//set result to zero
				memory=0;				//sets memory to zero
				System.out.println("The result in memory is set to 0");
			}
			else
			{
				 try{					//error handling
					nextNumber = keyboard.nextDouble();	//sets nextNumber
					super.setResult( super.evaluate(nextOp, super.resultValue(), nextNumber));
					System.out.println("result " + nextOp + " "
								+ nextNumber + " = " + super.resultValue());
					System.out.println("updated result = " + super.resultValue());
				}catch(InputMismatchException e){		//catches error
                   			 System.out.println("Incorrect input  ...");
				}
			}
		}
	}

/**
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
			case '^':						//power
               			 answer = Math.pow(n1, n2);			//answer is from power
               			 System.out.println("Power of " + n1 + " to the power of " + n2 + " has been completed :)");
               			 break;
           		 case 'q':						//root
               			 answer = Math.pow(n1, 1.0/n2);			//answer is from a root
              			 System.out.println("Rooting of " + n1 + " by " + 1.0/n2 + " has been completed :)");
               			 break;
			default:
				throw new UnknownOpException();			//else there exist an error in input

		}
		return answer;
	}
/**
Exception for dividing by zero
*/
	public void handleDivideByZeroException(DivideByZeroException e)	//Exception for dividing by zero
	{
		System.out.println("Dividing by zero."); 
		System.out.println("Program aborted");
		System.exit(0); 
	}
/**
Exception for foreign operation
*/
	public void handleUnknownOpException(UnknownOpException e)		//Exception for foreign operation
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
		catch(UnknownOpException e2) 					//catching the error
		{
			System.out.println(e2.getMessage());			//outputs a message for alert
			System.out.println("Try again at some other time."); 
			System.out.println("Program ending.");
			System.exit(0); 
		}
		catch(DivideByZeroException e3) 				//catches dividing by zero
		{
			handleDivideByZeroException(e3); 
		}
	}



























}
