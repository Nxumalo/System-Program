import java.util.*;
import java.io.*;

public class Bubble{

	public static int[] array={9,8,7,6,5,4,3,2,11110,12,19,16,15,14,17,18,67,21,56,45,};
	
	
	public static void main(String[] args){
		
		for(int i=array.length;i>1;i--){
	
			for(int j=0;j<i-1;j++){
				if(array[j]>array[j+1]){
					swap(j,j+1);
				}
			}
	
	
		}
	for(int k=0;k<array.length;k++){
		System.out.println(array[k]);
	
	}


	}
	
	public static void swap(int one,int two){
		int temp=array[one];
		array[one]=array[two];
		array[two]=temp;

	
	}


}
