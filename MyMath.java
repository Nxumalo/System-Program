import java.util.*;
import java.io.*;

public class MyMath{

	public static void main(String[] args){
		System.out.print(myRound(1.98763245,6));
		System.out.println("");


	}

	public static double myRound(double num,int deci){
		double factor = Math.pow(10.0,deci);
		return ((int)(num*factor+0.5)/factor);
	}



}
