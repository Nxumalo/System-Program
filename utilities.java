/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Programming assignment 2.1<p>
<p>Last modified: 31/08/2020<p>

<h1>Calculating tax due to SARS</h1>


This class cleates methods to be used in other classes for comparisons. This includes comparing the smallest height, greatest height and also youngest height. These will then be used to in our class utilities.


@param no1
@param no2	
*/
public class utilities{
/**
This method is used to compare the the greatest of two integers
@return the greatest of int 1 and int 2
	*/
public static boolean isGreaterThan(int no1, int no2){
	
	boolean great=false;				//creates a boolean great and sets it to false
	//System.out.print("Is the first number greater than the second?");
	if(no1>no2){
		great=true;				//sets boolean great to true
		}
	return great;					//returns great



		} 
/**
This method compares the two doubles and returns the smallest of them
@return the smallest of two double data type numbers
	*/
/**@param no1
@param no2*/
public static double smallerOf(double no1, double no2){
	
		if (no1==no2){
			return no1;			//if n01 is equal than n02
		   }
		
		if(no1<no2){
			return no1;			//if n01 is smaller than n01
		   }
		else{
			return no2;			//if n02 is smaller than n01
		  }
		}
	/**
This method compares the largest of two double data type numbers
@return the largest of two numbers
		*/
/**@param no1
@param no2	*/
public static double largerOf(double no1, double no2){
	
		if(no1==no2){
			return no1;			//if n01 is equal to n02
		  }

		if(no1>no2){
			return no1;			//if n01 is greater than n02
		  }

		else{
			return no2;			//if n02 is greater than n01
		}
		}
}
