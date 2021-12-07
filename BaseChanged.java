import java.util.*;
import java.io.*;

public class BaseChanged{

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		int number;
		int base;
		int convert;
		int temp;
		int newNum;

		System.out.println("Please enter number to convert: ");
		number=input.nextInt();
		System.out.println("Please enter base for number convertion: ");
		base=input.nextInt();

		convert=number/base;
		while(convert!=0){
		
			convert=number/base;
			System.out.println(convert);
			temp=base*convert;
			System.out.println(temp);
			newNum=number-temp;
			System.out.println(newNum);
			number=convert;

		}		
		System.out.println("");

	}
}
