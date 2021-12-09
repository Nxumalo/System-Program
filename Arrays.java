import java.util.Scanner;

public class Arrays
{
	int[] number = new int[5];
	
	public void initializeArray()
	{	for (int i=0; i< number.length; i++)
			number[i] = i*2;
	}
	
	public void tripleValuesInArray(int[] arr) // note, a reference of an array is passed to this method
	{	for (int i=0; i< arr.length; i=i+1) // although this method does not return any value, i.e. void
		{	arr[i] = arr[i]*3;		 // the values of the array number have been tripled as a
		}					 // result of passing by reference "mechanism"
	}

	public int[] doubleValuesInArray(int[] arr2) // note, an array is returned by this method 
	{	int[] temp = new int[arr2.length];    // although a reference is passed to the array
                                                    // the values in array arr2 are not modified.
		// copy elements from number to temp array  The values in newly created array temp are modified.
		for(int i=0; i < arr2.length; i++)    // The modified array is then returned by the method and
			temp[i] = arr2[i]; 		    // when assigned to another array will result in
                                                    // this array to be associated with the variable
		for(int i=0; i < temp.length; i++)    // to which the returned array is assigned.
			temp[i] = 2*temp[i];

		return temp;				   // return the entire array
	}	

	public void displayArray(int[] arr1, String nam)
	{	System.out.println("Content of array "+nam);
		System.out.println("----------------------------");

		for (int i=0; i< arr1.length; i++)
		{	System.out.println("value["+i+"] = "+arr1[i]);
		}
		System.out.println();

	}

	public void run()
	{	initializeArray();
		displayArray(number,"number");	
		tripleValuesInArray(number);
		displayArray(number,"number");	
		int[] val = doubleValuesInArray(number); // array val now refers to the same array which is returned by method doubleValuesInArray
		displayArray(number,"number");
		displayArray(val,"val");
		System.out.println("Note, the values in array val is double that of array number while array number remains the same as before the method doubleValuesInArray() was executed.\n");
		

	}

	public static void main(String[] args)
	{
		ExampleOfArray1 objct1 = new ExampleOfArray1();
		objct1.run();
	}
}	
