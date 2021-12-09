import java.util.*;
import java.io.*;

public class Utility{

	public static boolean isGreater(int one,int two){
		if(one>two){
			System.out.println("One is greater");
			return true;
	
		}
		else{
			System.out.println("One is not greater");
			return false;

		}

	}

	public static double smallerOf(double one, double two){
			if(one<=two){
				return one;
			}
			else{
				return two;
			}
	
	
	
	}

	public static double largerOf(double one,double two){
		if(one>=two){
			return one;
		}

		else{
			return two;
		}



	}

}
