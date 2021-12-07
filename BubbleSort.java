import java.util.*;
import java.io.*;

public class BubbleSort{

	public static int[] array={9,8,7,16,5,4,3,82,1};
	
	public static void main(String[] args){
		
		for(int i=array.length-1;i>=1;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					for(int k=0;k<array.length;k++){
						System.out.print(array[k]+"\t");
	
					}
					System.out.println("");
					swap(j,j+1);

			
	
				}
			
			}




		}
		for(int k=0;k<array.length;k++){
			System.out.print(array[k]);
	
		}
		System.out.println("");


	}
	
	public static void swap(int indexOne,int indextwo){
		int temp=array[indexOne];
		array[indexOne]=array[indextwo];
		array[indextwo]=temp;

	}


}
